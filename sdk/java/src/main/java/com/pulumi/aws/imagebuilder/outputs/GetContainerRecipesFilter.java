// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetContainerRecipesFilter {
    /**
     * @return The name of the filter field. Valid values can be found in the [Image Builder ListContainerRecipes API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListContainerRecipes.html).
     * 
     */
    private final String name;
    /**
     * @return Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private GetContainerRecipesFilter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * @return The name of the filter field. Valid values can be found in the [Image Builder ListContainerRecipes API Reference](https://docs.aws.amazon.com/imagebuilder/latest/APIReference/API_ListContainerRecipes.html).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerRecipesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerRecipesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetContainerRecipesFilter build() {
            return new GetContainerRecipesFilter(name, values);
        }
    }
}