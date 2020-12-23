package com.imooc.seckill.service.impl;

import com.imooc.seckill.dao.EventMapper;
import com.imooc.seckill.entity.Event;
import com.imooc.seckill.service.EventService;
import com.imooc.seckill.service.GoodService;
import com.imooc.seckill.service.model.EventModel;
import com.imooc.seckill.service.model.GoodModel;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventMapper eventMapper;

    @Autowired
    private GoodService goodService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void publishEvent(Integer id) {
        Event event = eventMapper.selectByGoodId(id);
        if (event.getGoodId() == null || event.getGoodId().intValue() == 0) {
            return;
        }

        GoodModel goodModel = goodService.getGoodById(event.getGoodId());
        String redisStockKey = "event_good_stock_" + goodModel.getId();
        redisTemplate.opsForValue().set(redisStockKey, goodModel.getStock());
    }

    @Override
    public EventModel getEventByGoodId(Integer id) {
        Event event = eventMapper.selectByGoodId(id);
        EventModel eventModel = covertEventModelFromEventEntity(event);
        if (eventModel == null) {
            return null;
        }
        if (eventModel.getStartDate().isAfterNow()) {
            eventModel.setStatus(1);
        } else if (eventModel.getEndDate().isBeforeNow()) {
            eventModel.setStatus(3);
        } else {
            eventModel.setStatus(2);
        }

        return eventModel;
    }

    private  EventModel covertEventModelFromEventEntity(Event event) {
        if (event == null) {
            return null;
        }
        EventModel eventModel = new EventModel();
        BeanUtils.copyProperties(event, eventModel);
        eventModel.setStartDate(new DateTime(event.getStartDate()));
        eventModel.setEndDate(new DateTime(event.getEndDate()));
        return eventModel;
    }
}
