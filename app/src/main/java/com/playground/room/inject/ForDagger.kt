package com.playground.room.inject

import javax.inject.Qualifier
import javax.inject.Scope

/**
 * Created by petnagy on 2018. 01. 24..
 */

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationContext