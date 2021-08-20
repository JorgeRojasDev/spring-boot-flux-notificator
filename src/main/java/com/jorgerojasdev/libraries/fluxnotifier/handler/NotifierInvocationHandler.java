package com.jorgerojasdev.libraries.fluxnotifier.handler;

import com.jorgerojasdev.libraries.fluxnotifier.service.implementation.NotifierImp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotifierInvocationHandler<T> implements InvocationHandler {

    private NotifierImp<T> notifierImp;

    public NotifierInvocationHandler(NotifierImp<T> notifierImp) {
        this.notifierImp = notifierImp;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.notifierImp, args);
    }
}
