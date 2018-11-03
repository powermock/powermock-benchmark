package org.powermock.benchmark.powermock1;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.powermock.benchmark.MockitoBenchmark;
import org.powermock.benchmark.PowerMockBenchmark;

public class BenchmarkRunnerV1 {
    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
                          .include(PowerMockBenchmark.class.getSimpleName())
                          .include(MockitoBenchmark.class.getSimpleName())
                          .forks(1)
                          .build();
    
        new Runner(opt).run();
    }
}
