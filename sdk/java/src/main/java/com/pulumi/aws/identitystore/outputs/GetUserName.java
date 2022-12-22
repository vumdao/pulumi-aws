// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserName {
    /**
     * @return The family name of the user.
     * 
     */
    private String familyName;
    /**
     * @return The name that is typically displayed when the name is shown for display.
     * 
     */
    private String formatted;
    /**
     * @return The given name of the user.
     * 
     */
    private String givenName;
    /**
     * @return The honorific prefix of the user.
     * 
     */
    private String honorificPrefix;
    /**
     * @return The honorific suffix of the user.
     * 
     */
    private String honorificSuffix;
    /**
     * @return The middle name of the user.
     * 
     */
    private String middleName;

    private GetUserName() {}
    /**
     * @return The family name of the user.
     * 
     */
    public String familyName() {
        return this.familyName;
    }
    /**
     * @return The name that is typically displayed when the name is shown for display.
     * 
     */
    public String formatted() {
        return this.formatted;
    }
    /**
     * @return The given name of the user.
     * 
     */
    public String givenName() {
        return this.givenName;
    }
    /**
     * @return The honorific prefix of the user.
     * 
     */
    public String honorificPrefix() {
        return this.honorificPrefix;
    }
    /**
     * @return The honorific suffix of the user.
     * 
     */
    public String honorificSuffix() {
        return this.honorificSuffix;
    }
    /**
     * @return The middle name of the user.
     * 
     */
    public String middleName() {
        return this.middleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserName defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String familyName;
        private String formatted;
        private String givenName;
        private String honorificPrefix;
        private String honorificSuffix;
        private String middleName;
        public Builder() {}
        public Builder(GetUserName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.familyName = defaults.familyName;
    	      this.formatted = defaults.formatted;
    	      this.givenName = defaults.givenName;
    	      this.honorificPrefix = defaults.honorificPrefix;
    	      this.honorificSuffix = defaults.honorificSuffix;
    	      this.middleName = defaults.middleName;
        }

        @CustomType.Setter
        public Builder familyName(String familyName) {
            this.familyName = Objects.requireNonNull(familyName);
            return this;
        }
        @CustomType.Setter
        public Builder formatted(String formatted) {
            this.formatted = Objects.requireNonNull(formatted);
            return this;
        }
        @CustomType.Setter
        public Builder givenName(String givenName) {
            this.givenName = Objects.requireNonNull(givenName);
            return this;
        }
        @CustomType.Setter
        public Builder honorificPrefix(String honorificPrefix) {
            this.honorificPrefix = Objects.requireNonNull(honorificPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder honorificSuffix(String honorificSuffix) {
            this.honorificSuffix = Objects.requireNonNull(honorificSuffix);
            return this;
        }
        @CustomType.Setter
        public Builder middleName(String middleName) {
            this.middleName = Objects.requireNonNull(middleName);
            return this;
        }
        public GetUserName build() {
            final var o = new GetUserName();
            o.familyName = familyName;
            o.formatted = formatted;
            o.givenName = givenName;
            o.honorificPrefix = honorificPrefix;
            o.honorificSuffix = honorificSuffix;
            o.middleName = middleName;
            return o;
        }
    }
}