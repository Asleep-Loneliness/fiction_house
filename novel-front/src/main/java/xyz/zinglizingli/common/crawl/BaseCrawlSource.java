package xyz.zinglizingli.common.crawl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * 爬虫源
 * @author 11797
 */
@Data
public abstract class BaseCrawlSource {

    @Value("${books.lowestScore}")
    private Float lowestScore;

    /**
     * 解析数据
     * */
    public abstract void parse();
}
