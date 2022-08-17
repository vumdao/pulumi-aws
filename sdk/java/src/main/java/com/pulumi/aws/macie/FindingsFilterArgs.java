// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie;

import com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FindingsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FindingsFilterArgs Empty = new FindingsFilterArgs();

    /**
     * The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don&#39;t perform any action on the findings.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don&#39;t perform any action on the findings.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * A custom description of the filter. The description can contain as many as 512 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A custom description of the filter. The description can contain as many as 512 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The criteria to use to filter findings.
     * 
     */
    @Import(name="findingCriteria", required=true)
    private Output<FindingsFilterFindingCriteriaArgs> findingCriteria;

    /**
     * @return The criteria to use to filter findings.
     * 
     */
    public Output<FindingsFilterFindingCriteriaArgs> findingCriteria() {
        return this.findingCriteria;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
     * 
     */
    @Import(name="position")
    private @Nullable Output<Integer> position;

    /**
     * @return The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
     * 
     */
    public Optional<Output<Integer>> position() {
        return Optional.ofNullable(this.position);
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the filter.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of key-value pairs that specifies the tags to associate with the filter.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FindingsFilterArgs() {}

    private FindingsFilterArgs(FindingsFilterArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.findingCriteria = $.findingCriteria;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.position = $.position;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FindingsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FindingsFilterArgs $;

        public Builder() {
            $ = new FindingsFilterArgs();
        }

        public Builder(FindingsFilterArgs defaults) {
            $ = new FindingsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don&#39;t perform any action on the findings.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don&#39;t perform any action on the findings.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description A custom description of the filter. The description can contain as many as 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A custom description of the filter. The description can contain as many as 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param findingCriteria The criteria to use to filter findings.
         * 
         * @return builder
         * 
         */
        public Builder findingCriteria(Output<FindingsFilterFindingCriteriaArgs> findingCriteria) {
            $.findingCriteria = findingCriteria;
            return this;
        }

        /**
         * @param findingCriteria The criteria to use to filter findings.
         * 
         * @return builder
         * 
         */
        public Builder findingCriteria(FindingsFilterFindingCriteriaArgs findingCriteria) {
            return findingCriteria(Output.of(findingCriteria));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param namePrefix Creates a unique name beginning with the specified prefix. Conflicts with `name`.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        /**
         * @param position The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
         * 
         * @return builder
         * 
         */
        public Builder position(@Nullable Output<Integer> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        /**
         * @param tags A map of key-value pairs that specifies the tags to associate with the filter.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of key-value pairs that specifies the tags to associate with the filter.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public FindingsFilterArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.findingCriteria = Objects.requireNonNull($.findingCriteria, "expected parameter 'findingCriteria' to be non-null");
            return $;
        }
    }

}