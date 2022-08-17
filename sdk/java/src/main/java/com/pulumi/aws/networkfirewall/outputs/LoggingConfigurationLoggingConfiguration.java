// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.LoggingConfigurationLoggingConfigurationLogDestinationConfig;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LoggingConfigurationLoggingConfiguration {
    /**
     * @return Set of configuration blocks describing the logging details for a firewall. See Log Destination Config below for details. At most, only two blocks can be specified; one for `FLOW` logs and one for `ALERT` logs.
     * 
     */
    private final List<LoggingConfigurationLoggingConfigurationLogDestinationConfig> logDestinationConfigs;

    @CustomType.Constructor
    private LoggingConfigurationLoggingConfiguration(@CustomType.Parameter("logDestinationConfigs") List<LoggingConfigurationLoggingConfigurationLogDestinationConfig> logDestinationConfigs) {
        this.logDestinationConfigs = logDestinationConfigs;
    }

    /**
     * @return Set of configuration blocks describing the logging details for a firewall. See Log Destination Config below for details. At most, only two blocks can be specified; one for `FLOW` logs and one for `ALERT` logs.
     * 
     */
    public List<LoggingConfigurationLoggingConfigurationLogDestinationConfig> logDestinationConfigs() {
        return this.logDestinationConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LoggingConfigurationLoggingConfigurationLogDestinationConfig> logDestinationConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestinationConfigs = defaults.logDestinationConfigs;
        }

        public Builder logDestinationConfigs(List<LoggingConfigurationLoggingConfigurationLogDestinationConfig> logDestinationConfigs) {
            this.logDestinationConfigs = Objects.requireNonNull(logDestinationConfigs);
            return this;
        }
        public Builder logDestinationConfigs(LoggingConfigurationLoggingConfigurationLogDestinationConfig... logDestinationConfigs) {
            return logDestinationConfigs(List.of(logDestinationConfigs));
        }        public LoggingConfigurationLoggingConfiguration build() {
            return new LoggingConfigurationLoggingConfiguration(logDestinationConfigs);
        }
    }
}