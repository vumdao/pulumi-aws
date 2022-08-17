// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MemberState extends com.pulumi.resources.ResourceArgs {

    public static final MemberState Empty = new MemberState();

    /**
     * AWS account ID for member account.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return AWS account ID for member account.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The detector ID of the GuardDuty account where you want to create member accounts.
     * 
     */
    @Import(name="detectorId")
    private @Nullable Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty account where you want to create member accounts.
     * 
     */
    public Optional<Output<String>> detectorId() {
        return Optional.ofNullable(this.detectorId);
    }

    /**
     * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
     * 
     */
    @Import(name="disableEmailNotification")
    private @Nullable Output<Boolean> disableEmailNotification;

    /**
     * @return Boolean whether an email notification is sent to the accounts. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> disableEmailNotification() {
        return Optional.ofNullable(this.disableEmailNotification);
    }

    /**
     * Email address for member account.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email address for member account.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Message for invitation.
     * 
     */
    @Import(name="invitationMessage")
    private @Nullable Output<String> invitationMessage;

    /**
     * @return Message for invitation.
     * 
     */
    public Optional<Output<String>> invitationMessage() {
        return Optional.ofNullable(this.invitationMessage);
    }

    /**
     * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
     * 
     */
    @Import(name="invite")
    private @Nullable Output<Boolean> invite;

    /**
     * @return Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
     * 
     */
    public Optional<Output<Boolean>> invite() {
        return Optional.ofNullable(this.invite);
    }

    /**
     * The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
     * 
     */
    @Import(name="relationshipStatus")
    private @Nullable Output<String> relationshipStatus;

    /**
     * @return The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
     * 
     */
    public Optional<Output<String>> relationshipStatus() {
        return Optional.ofNullable(this.relationshipStatus);
    }

    private MemberState() {}

    private MemberState(MemberState $) {
        this.accountId = $.accountId;
        this.detectorId = $.detectorId;
        this.disableEmailNotification = $.disableEmailNotification;
        this.email = $.email;
        this.invitationMessage = $.invitationMessage;
        this.invite = $.invite;
        this.relationshipStatus = $.relationshipStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MemberState $;

        public Builder() {
            $ = new MemberState();
        }

        public Builder(MemberState defaults) {
            $ = new MemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId AWS account ID for member account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId AWS account ID for member account.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param detectorId The detector ID of the GuardDuty account where you want to create member accounts.
         * 
         * @return builder
         * 
         */
        public Builder detectorId(@Nullable Output<String> detectorId) {
            $.detectorId = detectorId;
            return this;
        }

        /**
         * @param detectorId The detector ID of the GuardDuty account where you want to create member accounts.
         * 
         * @return builder
         * 
         */
        public Builder detectorId(String detectorId) {
            return detectorId(Output.of(detectorId));
        }

        /**
         * @param disableEmailNotification Boolean whether an email notification is sent to the accounts. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableEmailNotification(@Nullable Output<Boolean> disableEmailNotification) {
            $.disableEmailNotification = disableEmailNotification;
            return this;
        }

        /**
         * @param disableEmailNotification Boolean whether an email notification is sent to the accounts. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableEmailNotification(Boolean disableEmailNotification) {
            return disableEmailNotification(Output.of(disableEmailNotification));
        }

        /**
         * @param email Email address for member account.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email address for member account.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param invitationMessage Message for invitation.
         * 
         * @return builder
         * 
         */
        public Builder invitationMessage(@Nullable Output<String> invitationMessage) {
            $.invitationMessage = invitationMessage;
            return this;
        }

        /**
         * @param invitationMessage Message for invitation.
         * 
         * @return builder
         * 
         */
        public Builder invitationMessage(String invitationMessage) {
            return invitationMessage(Output.of(invitationMessage));
        }

        /**
         * @param invite Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
         * 
         * @return builder
         * 
         */
        public Builder invite(@Nullable Output<Boolean> invite) {
            $.invite = invite;
            return this;
        }

        /**
         * @param invite Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
         * 
         * @return builder
         * 
         */
        public Builder invite(Boolean invite) {
            return invite(Output.of(invite));
        }

        /**
         * @param relationshipStatus The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
         * 
         * @return builder
         * 
         */
        public Builder relationshipStatus(@Nullable Output<String> relationshipStatus) {
            $.relationshipStatus = relationshipStatus;
            return this;
        }

        /**
         * @param relationshipStatus The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
         * 
         * @return builder
         * 
         */
        public Builder relationshipStatus(String relationshipStatus) {
            return relationshipStatus(Output.of(relationshipStatus));
        }

        public MemberState build() {
            return $;
        }
    }

}