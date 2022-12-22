// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserNameArgs Empty = new UserNameArgs();

    /**
     * The family name of the user.
     * 
     */
    @Import(name="familyName", required=true)
    private Output<String> familyName;

    /**
     * @return The family name of the user.
     * 
     */
    public Output<String> familyName() {
        return this.familyName;
    }

    /**
     * The name that is typically displayed when the name is shown for display.
     * 
     */
    @Import(name="formatted")
    private @Nullable Output<String> formatted;

    /**
     * @return The name that is typically displayed when the name is shown for display.
     * 
     */
    public Optional<Output<String>> formatted() {
        return Optional.ofNullable(this.formatted);
    }

    /**
     * The given name of the user.
     * 
     */
    @Import(name="givenName", required=true)
    private Output<String> givenName;

    /**
     * @return The given name of the user.
     * 
     */
    public Output<String> givenName() {
        return this.givenName;
    }

    /**
     * The honorific prefix of the user.
     * 
     */
    @Import(name="honorificPrefix")
    private @Nullable Output<String> honorificPrefix;

    /**
     * @return The honorific prefix of the user.
     * 
     */
    public Optional<Output<String>> honorificPrefix() {
        return Optional.ofNullable(this.honorificPrefix);
    }

    /**
     * The honorific suffix of the user.
     * 
     */
    @Import(name="honorificSuffix")
    private @Nullable Output<String> honorificSuffix;

    /**
     * @return The honorific suffix of the user.
     * 
     */
    public Optional<Output<String>> honorificSuffix() {
        return Optional.ofNullable(this.honorificSuffix);
    }

    /**
     * The middle name of the user.
     * 
     */
    @Import(name="middleName")
    private @Nullable Output<String> middleName;

    /**
     * @return The middle name of the user.
     * 
     */
    public Optional<Output<String>> middleName() {
        return Optional.ofNullable(this.middleName);
    }

    private UserNameArgs() {}

    private UserNameArgs(UserNameArgs $) {
        this.familyName = $.familyName;
        this.formatted = $.formatted;
        this.givenName = $.givenName;
        this.honorificPrefix = $.honorificPrefix;
        this.honorificSuffix = $.honorificSuffix;
        this.middleName = $.middleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserNameArgs $;

        public Builder() {
            $ = new UserNameArgs();
        }

        public Builder(UserNameArgs defaults) {
            $ = new UserNameArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param familyName The family name of the user.
         * 
         * @return builder
         * 
         */
        public Builder familyName(Output<String> familyName) {
            $.familyName = familyName;
            return this;
        }

        /**
         * @param familyName The family name of the user.
         * 
         * @return builder
         * 
         */
        public Builder familyName(String familyName) {
            return familyName(Output.of(familyName));
        }

        /**
         * @param formatted The name that is typically displayed when the name is shown for display.
         * 
         * @return builder
         * 
         */
        public Builder formatted(@Nullable Output<String> formatted) {
            $.formatted = formatted;
            return this;
        }

        /**
         * @param formatted The name that is typically displayed when the name is shown for display.
         * 
         * @return builder
         * 
         */
        public Builder formatted(String formatted) {
            return formatted(Output.of(formatted));
        }

        /**
         * @param givenName The given name of the user.
         * 
         * @return builder
         * 
         */
        public Builder givenName(Output<String> givenName) {
            $.givenName = givenName;
            return this;
        }

        /**
         * @param givenName The given name of the user.
         * 
         * @return builder
         * 
         */
        public Builder givenName(String givenName) {
            return givenName(Output.of(givenName));
        }

        /**
         * @param honorificPrefix The honorific prefix of the user.
         * 
         * @return builder
         * 
         */
        public Builder honorificPrefix(@Nullable Output<String> honorificPrefix) {
            $.honorificPrefix = honorificPrefix;
            return this;
        }

        /**
         * @param honorificPrefix The honorific prefix of the user.
         * 
         * @return builder
         * 
         */
        public Builder honorificPrefix(String honorificPrefix) {
            return honorificPrefix(Output.of(honorificPrefix));
        }

        /**
         * @param honorificSuffix The honorific suffix of the user.
         * 
         * @return builder
         * 
         */
        public Builder honorificSuffix(@Nullable Output<String> honorificSuffix) {
            $.honorificSuffix = honorificSuffix;
            return this;
        }

        /**
         * @param honorificSuffix The honorific suffix of the user.
         * 
         * @return builder
         * 
         */
        public Builder honorificSuffix(String honorificSuffix) {
            return honorificSuffix(Output.of(honorificSuffix));
        }

        /**
         * @param middleName The middle name of the user.
         * 
         * @return builder
         * 
         */
        public Builder middleName(@Nullable Output<String> middleName) {
            $.middleName = middleName;
            return this;
        }

        /**
         * @param middleName The middle name of the user.
         * 
         * @return builder
         * 
         */
        public Builder middleName(String middleName) {
            return middleName(Output.of(middleName));
        }

        public UserNameArgs build() {
            $.familyName = Objects.requireNonNull($.familyName, "expected parameter 'familyName' to be non-null");
            $.givenName = Objects.requireNonNull($.givenName, "expected parameter 'givenName' to be non-null");
            return $;
        }
    }

}