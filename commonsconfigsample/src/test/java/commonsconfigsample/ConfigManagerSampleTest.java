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
    
    @Test
    public void testGetEnvValue1() throws Exception {
    	ConfigManagerSample underTest = new ConfigManagerSample();
    	// モックライブラリ使うと環境変数もセットできるらしいが。ひとまず普段はEclipseで設定しておくようにする。
    	Assertions.assertThat(underTest.getString("env1")).isEqualTo("hogehogevalue");
    }
}
