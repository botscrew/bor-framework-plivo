package com.botscrew.botframework.plivo.config.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Implementation of {@link ExecutorProperties} for describing event handler executor
 * Contains default values for the properties.
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "plivo.bot.events-executor")
public class HandlerTaskExecutorProperties implements ExecutorProperties {
    private Integer corePoolSize;
    private Integer maxPoolSize;
    private Integer queueCapacity;
    private Integer keepAliveSeconds;

    public HandlerTaskExecutorProperties() {
        this.corePoolSize = 5;
        this.maxPoolSize = 25;
        this.queueCapacity = 500;
        this.keepAliveSeconds = 10;
    }
}
