package xyz.zinglizingli.common.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.zinglizingli.common.crawl.BaseHtmlCrawlSource;
import xyz.zinglizingli.common.crawl.BiquCrawlSource;

/**
 * @author 11797
 */
@Slf4j
@Configuration
public class CrawlBiqudaoConfig {


    @Bean
    @ConfigurationProperties(prefix = "biqudao.crawlsource") // prefix值必须是application.yml中对应属性的前缀
    @ConditionalOnProperty(prefix = "biqudao.crawlsource",name = "enabled",havingValue = "true")
    public BaseHtmlCrawlSource BiqutaCrawlSource() {
        return new BiquCrawlSource();
    }


}
