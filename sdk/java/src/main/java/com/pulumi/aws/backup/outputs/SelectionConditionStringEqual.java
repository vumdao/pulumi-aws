// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SelectionConditionStringEqual {
    /**
     * @return The key in a key-value pair.
     * 
     */
    private final String key;
    /**
     * @return The value in a key-value pair.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private SelectionConditionStringEqual(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return The key in a key-value pair.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value in a key-value pair.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectionConditionStringEqual defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectionConditionStringEqual defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SelectionConditionStringEqual build() {
            return new SelectionConditionStringEqual(key, value);
        }
    }
}