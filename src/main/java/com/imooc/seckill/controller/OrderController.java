package com.imooc.seckill.controller;

import com.imooc.seckill.controller.viewmodel.GoodViewModel;
import com.imooc.seckill.controller.viewmodel.OrderViewModel;
import com.imooc.seckill.error.BusinessError;
import com.imooc.seckill.error.BusinessException;
import com.imooc.seckill.response.CommonResponseType;
import com.imooc.seckill.service.OrderService;
import com.imooc.seckill.service.model.GoodModel;
import com.imooc.seckill.service.model.OrderModel;
import com.imooc.seckill.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller("order")
@RequestMapping("/order")
@CrossOrigin(origins = {"*"}, allowCredentials = "true")
public class OrderController extends BaseController{
    @Autowired
    private OrderService orderService;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/post", method = { RequestMethod.POST }, consumes = {CONTENT_TYPE_FORMED})
    @ResponseBody
    public CommonResponseType createOrder(
            @RequestParam(name = "itemId") Integer itemId,
            @RequestParam(name = "amount") Integer amount,
            @RequestParam(name = "eventId", required = false) Integer eventId) throws BusinessException {

        String clientToken = request.getParameterMap().get("token").length > 0 ? request.getParameterMap().get("token")[0] : "";
        if (StringUtils.isEmpty(clientToken)) {
            throw new BusinessException(BusinessError.USER_NOT_LOGIN, "user does not login");
        }
        UserModel userModel = (UserModel) redisTemplate.opsForValue().get(clientToken);
        if (userModel == null) {
            throw new BusinessException(BusinessError.USER_NOT_LOGIN, "user does not login");
        }
        OrderModel orderModel = orderService.createOrder(userModel.getId(), itemId, eventId, amount);
        OrderViewModel orderViewModel = convertViewModelFromDataModel(orderModel);
        CommonResponseType ret = CommonResponseType.newInstance(orderViewModel);
        return ret;
    }

    private OrderViewModel convertViewModelFromDataModel(OrderModel orderModel) {
        if (orderModel == null) {
            return null;
        }
        OrderViewModel orderViewModel = new OrderViewModel();
        BeanUtils.copyProperties(orderModel, orderViewModel);
        return orderViewModel;
    }
}
