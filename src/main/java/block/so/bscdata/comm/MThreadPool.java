package block.so.bscdata.comm;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

/**
 * 线程池
 * 
 * @author P7XXDMX
 *
 */
public class MThreadPool {

    public static ScheduledExecutorService getPool(int size, String pattern) {
        ScheduledExecutorService tasks = new ScheduledThreadPoolExecutor(size,
                new BasicThreadFactory.Builder().namingPattern(pattern + "-%d").daemon(true).build());
        return tasks;
    }
}
