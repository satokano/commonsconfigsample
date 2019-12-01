package commonsconfigsample;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigManagerSample {
    
    public String getString(String key) {
        Parameters params = new Parameters();
        FileBasedConfigurationBuilder<FileBasedConfiguration> builder = 
                new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                .configure(params.properties().setFileName("sample.properties"));
        
        try {
            Configuration config = builder.getConfiguration();
            String value = config.getString(key);
            return value;
        } catch (ConfigurationException cex) {
            throw new RuntimeException(cex);
        }
        
    }
    
}
