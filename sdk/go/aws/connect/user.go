// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Connect User resource. For more information see
// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
//
// ## Example Usage
// ### Basic
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewUser(ctx, "example", &connect.UserArgs{
//				InstanceId:       pulumi.Any(aws_connect_instance.Example.Id),
//				Password:         pulumi.String("Password123"),
//				RoutingProfileId: pulumi.Any(aws_connect_routing_profile.Example.Routing_profile_id),
//				SecurityProfileIds: pulumi.StringArray{
//					pulumi.Any(aws_connect_security_profile.Example.Security_profile_id),
//				},
//				IdentityInfo: &connect.UserIdentityInfoArgs{
//					FirstName: pulumi.String("example"),
//					LastName:  pulumi.String("example2"),
//				},
//				PhoneConfig: &connect.UserPhoneConfigArgs{
//					AfterContactWorkTimeLimit: pulumi.Int(0),
//					PhoneType:                 pulumi.String("SOFT_PHONE"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### With hierarchyGroupId
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewUser(ctx, "example", &connect.UserArgs{
//				InstanceId:       pulumi.Any(aws_connect_instance.Example.Id),
//				Password:         pulumi.String("Password123"),
//				RoutingProfileId: pulumi.Any(aws_connect_routing_profile.Example.Routing_profile_id),
//				HierarchyGroupId: pulumi.Any(aws_connect_user_hierarchy_group.Example.Hierarchy_group_id),
//				SecurityProfileIds: pulumi.StringArray{
//					pulumi.Any(aws_connect_security_profile.Example.Security_profile_id),
//				},
//				IdentityInfo: &connect.UserIdentityInfoArgs{
//					FirstName: pulumi.String("example"),
//					LastName:  pulumi.String("example2"),
//				},
//				PhoneConfig: &connect.UserPhoneConfigArgs{
//					AfterContactWorkTimeLimit: pulumi.Int(0),
//					PhoneType:                 pulumi.String("SOFT_PHONE"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### With identityInfo filled
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewUser(ctx, "example", &connect.UserArgs{
//				InstanceId:       pulumi.Any(aws_connect_instance.Example.Id),
//				Password:         pulumi.String("Password123"),
//				RoutingProfileId: pulumi.Any(aws_connect_routing_profile.Example.Routing_profile_id),
//				SecurityProfileIds: pulumi.StringArray{
//					pulumi.Any(aws_connect_security_profile.Example.Security_profile_id),
//				},
//				IdentityInfo: &connect.UserIdentityInfoArgs{
//					Email:     pulumi.String("example@example.com"),
//					FirstName: pulumi.String("example"),
//					LastName:  pulumi.String("example2"),
//				},
//				PhoneConfig: &connect.UserPhoneConfigArgs{
//					AfterContactWorkTimeLimit: pulumi.Int(0),
//					PhoneType:                 pulumi.String("SOFT_PHONE"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### With phoneConfig phone type as desk phone
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewUser(ctx, "example", &connect.UserArgs{
//				InstanceId:       pulumi.Any(aws_connect_instance.Example.Id),
//				Password:         pulumi.String("Password123"),
//				RoutingProfileId: pulumi.Any(aws_connect_routing_profile.Example.Routing_profile_id),
//				SecurityProfileIds: pulumi.StringArray{
//					pulumi.Any(aws_connect_security_profile.Example.Security_profile_id),
//				},
//				PhoneConfig: &connect.UserPhoneConfigArgs{
//					AfterContactWorkTimeLimit: pulumi.Int(0),
//					PhoneType:                 pulumi.String("SOFT_PHONE"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### With multiple Security profile ids specified in securityProfileIds
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := connect.NewUser(ctx, "example", &connect.UserArgs{
//				InstanceId:       pulumi.Any(aws_connect_instance.Example.Id),
//				Password:         pulumi.String("Password123"),
//				RoutingProfileId: pulumi.Any(aws_connect_routing_profile.Example.Routing_profile_id),
//				SecurityProfileIds: pulumi.StringArray{
//					pulumi.Any(aws_connect_security_profile.Example.Security_profile_id),
//					pulumi.Any(aws_connect_security_profile.Example2.Security_profile_id),
//				},
//				PhoneConfig: &connect.UserPhoneConfigArgs{
//					AfterContactWorkTimeLimit: pulumi.Int(0),
//					AutoAccept:                pulumi.Bool(false),
//					DeskPhoneNumber:           pulumi.String("+112345678912"),
//					PhoneType:                 pulumi.String("DESK_PHONE"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Amazon Connect Users can be imported using the `instance_id` and `user_id` separated by a colon (`:`), e.g.,
//
// ```sh
//
//	$ pulumi import aws:connect/user:User example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
//
// ```
type User struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the user.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
	DirectoryUserId pulumi.StringOutput `pulumi:"directoryUserId"`
	// The identifier of the hierarchy group for the user.
	HierarchyGroupId pulumi.StringPtrOutput `pulumi:"hierarchyGroupId"`
	// A block that contains information about the identity of the user. Documented below.
	IdentityInfo UserIdentityInfoPtrOutput `pulumi:"identityInfo"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// A block that contains information about the phone settings for the user. Documented below.
	PhoneConfig UserPhoneConfigOutput `pulumi:"phoneConfig"`
	// The identifier of the routing profile for the user.
	RoutingProfileId pulumi.StringOutput `pulumi:"routingProfileId"`
	// A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
	SecurityProfileIds pulumi.StringArrayOutput `pulumi:"securityProfileIds"`
	Tags               pulumi.StringMapOutput   `pulumi:"tags"`
	TagsAll            pulumi.StringMapOutput   `pulumi:"tagsAll"`
	// The identifier for the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	if args.PhoneConfig == nil {
		return nil, errors.New("invalid value for required argument 'PhoneConfig'")
	}
	if args.RoutingProfileId == nil {
		return nil, errors.New("invalid value for required argument 'RoutingProfileId'")
	}
	if args.SecurityProfileIds == nil {
		return nil, errors.New("invalid value for required argument 'SecurityProfileIds'")
	}
	var resource User
	err := ctx.RegisterResource("aws:connect/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("aws:connect/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// The Amazon Resource Name (ARN) of the user.
	Arn *string `pulumi:"arn"`
	// The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
	DirectoryUserId *string `pulumi:"directoryUserId"`
	// The identifier of the hierarchy group for the user.
	HierarchyGroupId *string `pulumi:"hierarchyGroupId"`
	// A block that contains information about the identity of the user. Documented below.
	IdentityInfo *UserIdentityInfo `pulumi:"identityInfo"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId *string `pulumi:"instanceId"`
	// The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
	Name *string `pulumi:"name"`
	// The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
	Password *string `pulumi:"password"`
	// A block that contains information about the phone settings for the user. Documented below.
	PhoneConfig *UserPhoneConfig `pulumi:"phoneConfig"`
	// The identifier of the routing profile for the user.
	RoutingProfileId *string `pulumi:"routingProfileId"`
	// A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
	SecurityProfileIds []string          `pulumi:"securityProfileIds"`
	Tags               map[string]string `pulumi:"tags"`
	TagsAll            map[string]string `pulumi:"tagsAll"`
	// The identifier for the user.
	UserId *string `pulumi:"userId"`
}

type UserState struct {
	// The Amazon Resource Name (ARN) of the user.
	Arn pulumi.StringPtrInput
	// The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
	DirectoryUserId pulumi.StringPtrInput
	// The identifier of the hierarchy group for the user.
	HierarchyGroupId pulumi.StringPtrInput
	// A block that contains information about the identity of the user. Documented below.
	IdentityInfo UserIdentityInfoPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringPtrInput
	// The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
	Name pulumi.StringPtrInput
	// The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
	Password pulumi.StringPtrInput
	// A block that contains information about the phone settings for the user. Documented below.
	PhoneConfig UserPhoneConfigPtrInput
	// The identifier of the routing profile for the user.
	RoutingProfileId pulumi.StringPtrInput
	// A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
	SecurityProfileIds pulumi.StringArrayInput
	Tags               pulumi.StringMapInput
	TagsAll            pulumi.StringMapInput
	// The identifier for the user.
	UserId pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
	DirectoryUserId *string `pulumi:"directoryUserId"`
	// The identifier of the hierarchy group for the user.
	HierarchyGroupId *string `pulumi:"hierarchyGroupId"`
	// A block that contains information about the identity of the user. Documented below.
	IdentityInfo *UserIdentityInfo `pulumi:"identityInfo"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId string `pulumi:"instanceId"`
	// The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
	Name *string `pulumi:"name"`
	// The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
	Password *string `pulumi:"password"`
	// A block that contains information about the phone settings for the user. Documented below.
	PhoneConfig UserPhoneConfig `pulumi:"phoneConfig"`
	// The identifier of the routing profile for the user.
	RoutingProfileId string `pulumi:"routingProfileId"`
	// A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
	SecurityProfileIds []string          `pulumi:"securityProfileIds"`
	Tags               map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
	DirectoryUserId pulumi.StringPtrInput
	// The identifier of the hierarchy group for the user.
	HierarchyGroupId pulumi.StringPtrInput
	// A block that contains information about the identity of the user. Documented below.
	IdentityInfo UserIdentityInfoPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringInput
	// The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
	Name pulumi.StringPtrInput
	// The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
	Password pulumi.StringPtrInput
	// A block that contains information about the phone settings for the user. Documented below.
	PhoneConfig UserPhoneConfigInput
	// The identifier of the routing profile for the user.
	RoutingProfileId pulumi.StringInput
	// A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
	SecurityProfileIds pulumi.StringArrayInput
	Tags               pulumi.StringMapInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// The Amazon Resource Name (ARN) of the user.
func (o UserOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The identifier of the user account in the directory used for identity management. If Amazon Connect cannot access the directory, you can specify this identifier to authenticate users. If you include the identifier, we assume that Amazon Connect cannot access the directory. Otherwise, the identity information is used to authenticate users from your directory. This parameter is required if you are using an existing directory for identity management in Amazon Connect when Amazon Connect cannot access your directory to authenticate users. If you are using SAML for identity management and include this parameter, an error is returned.
func (o UserOutput) DirectoryUserId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.DirectoryUserId }).(pulumi.StringOutput)
}

// The identifier of the hierarchy group for the user.
func (o UserOutput) HierarchyGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.HierarchyGroupId }).(pulumi.StringPtrOutput)
}

// A block that contains information about the identity of the user. Documented below.
func (o UserOutput) IdentityInfo() UserIdentityInfoPtrOutput {
	return o.ApplyT(func(v *User) UserIdentityInfoPtrOutput { return v.IdentityInfo }).(UserIdentityInfoPtrOutput)
}

// Specifies the identifier of the hosting Amazon Connect Instance.
func (o UserOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// The user name for the account. For instances not using SAML for identity management, the user name can include up to 20 characters. If you are using SAML for identity management, the user name can include up to 64 characters from `[a-zA-Z0-9_-.\@]+`.
func (o UserOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The password for the user account. A password is required if you are using Amazon Connect for identity management. Otherwise, it is an error to include a password.
func (o UserOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// A block that contains information about the phone settings for the user. Documented below.
func (o UserOutput) PhoneConfig() UserPhoneConfigOutput {
	return o.ApplyT(func(v *User) UserPhoneConfigOutput { return v.PhoneConfig }).(UserPhoneConfigOutput)
}

// The identifier of the routing profile for the user.
func (o UserOutput) RoutingProfileId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.RoutingProfileId }).(pulumi.StringOutput)
}

// A list of identifiers for the security profiles for the user. Specify a minimum of 1 and maximum of 10 security profile ids. For more information, see [Best Practices for Security Profiles](https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-best-practices.html) in the Amazon Connect Administrator Guide.
func (o UserOutput) SecurityProfileIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *User) pulumi.StringArrayOutput { return v.SecurityProfileIds }).(pulumi.StringArrayOutput)
}

func (o UserOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *User) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o UserOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *User) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The identifier for the user.
func (o UserOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}