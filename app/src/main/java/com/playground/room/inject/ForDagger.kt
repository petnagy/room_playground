package com.playground.room.inject

import javax.inject.Qualifier

/**
 * Created by petnagy on 2018. 01. 24..
 */

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationContext