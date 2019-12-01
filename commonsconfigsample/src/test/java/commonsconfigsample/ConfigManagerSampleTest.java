package commonsconfigsample;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConfigManagerSampleTest {

    @Test
    public void testGetString() throws Exception {
        ConfigManagerSample underTest = new ConfigManagerSample();
        Assertions.assertThat(underTest.getString("sample1")).isEqualTo("value1");
    }
    
    @Test
    public void testGetString_option1() throws Exception {
        ConfigManagerSample underTest = new ConfigManagerSample();
        
        Assertions.assertThat(underTest.getString("subsystem.title")).isEqualTo("commonsconfiguration2sample_option1");
        
    }
}
