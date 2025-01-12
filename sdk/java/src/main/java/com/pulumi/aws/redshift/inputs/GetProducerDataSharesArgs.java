// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.inputs;

import com.pulumi.aws.redshift.inputs.GetProducerDataSharesDataShareArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProducerDataSharesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProducerDataSharesArgs Empty = new GetProducerDataSharesArgs();

    /**
     * An array of all data shares in the producer. See `data_shares` below.
     * 
     */
    @Import(name="dataShares")
    private @Nullable Output<List<GetProducerDataSharesDataShareArgs>> dataShares;

    /**
     * @return An array of all data shares in the producer. See `data_shares` below.
     * 
     */
    public Optional<Output<List<GetProducerDataSharesDataShareArgs>>> dataShares() {
        return Optional.ofNullable(this.dataShares);
    }

    /**
     * Amazon Resource Name (ARN) of the producer namespace that returns in the list of datashares.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="producerArn", required=true)
    private Output<String> producerArn;

    /**
     * @return Amazon Resource Name (ARN) of the producer namespace that returns in the list of datashares.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> producerArn() {
        return this.producerArn;
    }

    /**
     * Status of a datashare in the producer. Valid values are `ACTIVE`, `AUTHORIZED`, `PENDING_AUTHORIZATION`, `DEAUTHORIZED`, and `REJECTED`. Omit this argument to return all statuses.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of a datashare in the producer. Valid values are `ACTIVE`, `AUTHORIZED`, `PENDING_AUTHORIZATION`, `DEAUTHORIZED`, and `REJECTED`. Omit this argument to return all statuses.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetProducerDataSharesArgs() {}

    private GetProducerDataSharesArgs(GetProducerDataSharesArgs $) {
        this.dataShares = $.dataShares;
        this.producerArn = $.producerArn;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProducerDataSharesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProducerDataSharesArgs $;

        public Builder() {
            $ = new GetProducerDataSharesArgs();
        }

        public Builder(GetProducerDataSharesArgs defaults) {
            $ = new GetProducerDataSharesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataShares An array of all data shares in the producer. See `data_shares` below.
         * 
         * @return builder
         * 
         */
        public Builder dataShares(@Nullable Output<List<GetProducerDataSharesDataShareArgs>> dataShares) {
            $.dataShares = dataShares;
            return this;
        }

        /**
         * @param dataShares An array of all data shares in the producer. See `data_shares` below.
         * 
         * @return builder
         * 
         */
        public Builder dataShares(List<GetProducerDataSharesDataShareArgs> dataShares) {
            return dataShares(Output.of(dataShares));
        }

        /**
         * @param dataShares An array of all data shares in the producer. See `data_shares` below.
         * 
         * @return builder
         * 
         */
        public Builder dataShares(GetProducerDataSharesDataShareArgs... dataShares) {
            return dataShares(List.of(dataShares));
        }

        /**
         * @param producerArn Amazon Resource Name (ARN) of the producer namespace that returns in the list of datashares.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder producerArn(Output<String> producerArn) {
            $.producerArn = producerArn;
            return this;
        }

        /**
         * @param producerArn Amazon Resource Name (ARN) of the producer namespace that returns in the list of datashares.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder producerArn(String producerArn) {
            return producerArn(Output.of(producerArn));
        }

        /**
         * @param status Status of a datashare in the producer. Valid values are `ACTIVE`, `AUTHORIZED`, `PENDING_AUTHORIZATION`, `DEAUTHORIZED`, and `REJECTED`. Omit this argument to return all statuses.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of a datashare in the producer. Valid values are `ACTIVE`, `AUTHORIZED`, `PENDING_AUTHORIZATION`, `DEAUTHORIZED`, and `REJECTED`. Omit this argument to return all statuses.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetProducerDataSharesArgs build() {
            if ($.producerArn == null) {
                throw new MissingRequiredPropertyException("GetProducerDataSharesArgs", "producerArn");
            }
            return $;
        }
    }

}
