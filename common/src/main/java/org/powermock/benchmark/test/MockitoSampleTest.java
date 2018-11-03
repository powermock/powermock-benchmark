package org.powermock.benchmark.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.benchmark.ClassToMock;
import org.powermock.benchmark.ClassToMock2;
import org.powermock.benchmark.PowerMockBenchmark;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoSampleTest {
    
    @Mock
    private ClassToMock2 classToMock2;
    
    @Test
    public void just_mock_class() {
        for (int i = 0; i < 100; i++) {
            final ClassToMock mock = mock(ClassToMock.class);
            when(mock.say()).thenReturn("sssss" + i);
            mock(PowerMockBenchmark.class);
        }
    }
    
    @Test
    public void just_mock_class1() {
        final ClassToMock mock = mock(ClassToMock.class);
        when(mock.say()).thenReturn("sssssfds");
        mock(PowerMockBenchmark.class);
    }
    
    @Test
    public void just_mock_class2() {
        final ClassToMock mock = mock(ClassToMock.class);
        when(mock.say()).thenReturn("sssdsfdsss");
        mock(PowerMockBenchmark.class);
        mock.say();
        verify(mock).say();
    }
    
    @Test
    public void just_mock_class3() {
        final ClassToMock2 mock = mock(ClassToMock2.class);
        when(mock.say()).thenReturn("ssssfdsfs");
        mock(PowerMockBenchmark.class);
    }
    
    @Test
    public void just_mock_class4() {
        final ClassToMock2 mock = mock(ClassToMock2.class);
        when(mock.say()).thenReturn("sssfdsfss");
        mock(PowerMockBenchmark.class);
        mock.say();
        mock.say1();
        mock.say1();
        mock.say1();
        verify(mock).say();
    }
    
    @Test
    public void just_mock_class5() {
        final ClassToMock2 mock = mock(ClassToMock2.class);
        when(mock.say()).thenReturn("ssdsfdsfds fsss");
        mock.say();
        mock.say1();
        mock.say1();
        mock.say1();
        verify(mock).say();
    }
    
}
