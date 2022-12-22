// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.budgets.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BudgetPlannedLimit {
    /**
     * @return (Required) The amount of cost or usage being measured for a budget.
     * 
     */
    private String amount;
    /**
     * @return (Required) The start time of the budget limit. Format: `2017-01-01_12:00`. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     * 
     */
    private String startTime;
    /**
     * @return (Required) The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     * 
     */
    private String unit;

    private BudgetPlannedLimit() {}
    /**
     * @return (Required) The amount of cost or usage being measured for a budget.
     * 
     */
    public String amount() {
        return this.amount;
    }
    /**
     * @return (Required) The start time of the budget limit. Format: `2017-01-01_12:00`. See [PlannedBudgetLimits](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_budgets_Budget.html#awscostmanagement-Type-budgets_Budget-PlannedBudgetLimits) documentation.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return (Required) The unit of measurement used for the budget forecast, actual spend, or budget threshold, such as dollars or GB. See [Spend](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/data-type-spend.html) documentation.
     * 
     */
    public String unit() {
        return this.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetPlannedLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String amount;
        private String startTime;
        private String unit;
        public Builder() {}
        public Builder(BudgetPlannedLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.startTime = defaults.startTime;
    	      this.unit = defaults.unit;
        }

        @CustomType.Setter
        public Builder amount(String amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        @CustomType.Setter
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        @CustomType.Setter
        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public BudgetPlannedLimit build() {
            final var o = new BudgetPlannedLimit();
            o.amount = amount;
            o.startTime = startTime;
            o.unit = unit;
            return o;
        }
    }
}