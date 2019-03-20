package com.ddh.springboot.first.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class User extends BaseDomain implements Serializable {
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    private String password;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 手机是否验证通过
     */
    @Column(name = "mobile_valid")
    private Boolean mobileValid;

    private String salt;

    @Column(name = "true_name")
    private String trueName;

    private Long role;

    /**
     * 冗余,角色名
     */
    @Column(name = "role_name")
    private String roleName;

    private String weixin;

    /**
     * 头像
     */
    private String photo;

    /**
     * 客户类型
     */
    @Column(name = "customer_type")
    private Byte customerType;

    /**
     * 是否删除,1505261200
     */
    private int deleted;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "last_modified_by")
    private Long lastModifiedBy;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    private Byte status;

    private String token;

    /**
     * 总订单数
     */
    @Column(name = "order_num")
    private Integer orderNum;

    /**
     * 评价个数
     */
    @Column(name = "rate_num")
    private Integer rateNum;

    /**
     * 评价星星数
     */
    @Column(name = "rate_star")
    private Integer rateStar;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String county;

    /**
     * 路名或街道，门牌号
     */
    private String address;

    /**
     * 公司名
     */
    private String company;

    private Integer version;

    /**
     * 客服ID
     */
    @Column(name = "cs_id")
    private Long csId;

    /**
     * 管理人员id
     */
    @Column(name = "manager_id")
    private Long managerId;

    /**
     * 组织ID
     */
    @Column(name = "org_id")
    private Long orgId;

    /**
     * 发布货源定金
     */
    @Column(name = "desire_earnest")
    private BigDecimal desireEarnest;

    /**
     * 锁定
     */
    private Boolean locked;

    /**
     * 是否是测试账户
     */
    @Column(name = "is_test")
    private Boolean isTest;

    /**
     * 公司内账号
     */
    @Column(name = "built_in")
    private Boolean builtIn;

    /**
     * 用户来源
     */
    private String source;

    /**
     * 微信openid
     */
    @Column(name = "wx_openid")
    private String wxOpenid;

    /**
     * 登录设备台数限制
     */
    @Column(name = "devices_limit")
    private Integer devicesLimit;

    /**
     * 推广码
     */
    @Column(name = "promotion_code")
    private String promotionCode;

    /**
     * 推荐人的id
     */
    @Column(name = "referrer_id")
    private Long referrerId;

    /**
     * 分享二维码的URL
     */
    @Column(name = "promotion_code_url")
    private String promotionCodeUrl;

    /**
     * 首单完成时间
     */
    @Column(name = "first_order_date")
    private Date firstOrderDate;

    /**
     * 第一次登录时间
     */
    @Column(name = "first_login_date")
    private Date firstLoginDate;

    /**
     * 是否精简调度
     */
    @Column(name = "manager_lite")
    private Boolean managerLite;

    /**
     * 调度员姓名
     */
    @Column(name = "dispatcher_name")
    private String dispatcherName;

    /**
     * 调度员手机号
     */
    @Column(name = "dispatcher_phone")
    private String dispatcherPhone;

    private static final long serialVersionUID = 1L;

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取手机号码
     *
     * @return mobile - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取手机是否验证通过
     *
     * @return mobile_valid - 手机是否验证通过
     */
    public Boolean getMobileValid() {
        return mobileValid;
    }

    /**
     * 设置手机是否验证通过
     *
     * @param mobileValid 手机是否验证通过
     */
    public void setMobileValid(Boolean mobileValid) {
        this.mobileValid = mobileValid;
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * @return true_name
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * @param trueName
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    /**
     * @return role
     */
    public Long getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(Long role) {
        this.role = role;
    }

    /**
     * 获取冗余,角色名
     *
     * @return role_name - 冗余,角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置冗余,角色名
     *
     * @param roleName 冗余,角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * @return weixin
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * @param weixin
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    /**
     * 获取头像
     *
     * @return photo - 头像
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置头像
     *
     * @param photo 头像
     */
    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    /**
     * 获取客户类型
     *
     * @return customer_type - 客户类型
     */
    public Byte getCustomerType() {
        return customerType;
    }

    /**
     * 设置客户类型
     *
     * @param customerType 客户类型
     */
    public void setCustomerType(Byte customerType) {
        this.customerType = customerType;
    }

    /**
     * 获取是否删除,1505261200
     *
     * @return deleted - 是否删除,1505261200
     */
    public int getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除,1505261200
     *
     * @param deleted 是否删除,1505261200
     */
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    /**
     * @return created_date
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return last_modified_by
     */
    public Long getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(Long lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return last_modified_date
     */
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 获取总订单数
     *
     * @return order_num - 总订单数
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置总订单数
     *
     * @param orderNum 总订单数
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取评价个数
     *
     * @return rate_num - 评价个数
     */
    public Integer getRateNum() {
        return rateNum;
    }

    /**
     * 设置评价个数
     *
     * @param rateNum 评价个数
     */
    public void setRateNum(Integer rateNum) {
        this.rateNum = rateNum;
    }

    /**
     * 获取评价星星数
     *
     * @return rate_star - 评价星星数
     */
    public Integer getRateStar() {
        return rateStar;
    }

    /**
     * 设置评价星星数
     *
     * @param rateStar 评价星星数
     */
    public void setRateStar(Integer rateStar) {
        this.rateStar = rateStar;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 获取区县
     *
     * @return county - 区县
     */
    public String getCounty() {
        return county;
    }

    /**
     * 设置区县
     *
     * @param county 区县
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * 获取路名或街道，门牌号
     *
     * @return address - 路名或街道，门牌号
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置路名或街道，门牌号
     *
     * @param address 路名或街道，门牌号
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取公司名
     *
     * @return company - 公司名
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置公司名
     *
     * @param company 公司名
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取客服ID
     *
     * @return cs_id - 客服ID
     */
    public Long getCsId() {
        return csId;
    }

    /**
     * 设置客服ID
     *
     * @param csId 客服ID
     */
    public void setCsId(Long csId) {
        this.csId = csId;
    }

    /**
     * 获取管理人员id
     *
     * @return manager_id - 管理人员id
     */
    public Long getManagerId() {
        return managerId;
    }

    /**
     * 设置管理人员id
     *
     * @param managerId 管理人员id
     */
    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    /**
     * 获取组织ID
     *
     * @return org_id - 组织ID
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * 设置组织ID
     *
     * @param orgId 组织ID
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取发布货源定金
     *
     * @return desire_earnest - 发布货源定金
     */
    public BigDecimal getDesireEarnest() {
        return desireEarnest;
    }

    /**
     * 设置发布货源定金
     *
     * @param desireEarnest 发布货源定金
     */
    public void setDesireEarnest(BigDecimal desireEarnest) {
        this.desireEarnest = desireEarnest;
    }

    /**
     * 获取锁定
     *
     * @return locked - 锁定
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 设置锁定
     *
     * @param locked 锁定
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * 获取是否是测试账户
     *
     * @return is_test - 是否是测试账户
     */
    public Boolean getIsTest() {
        return isTest;
    }

    /**
     * 设置是否是测试账户
     *
     * @param isTest 是否是测试账户
     */
    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }

    /**
     * 获取公司内账号
     *
     * @return built_in - 公司内账号
     */
    public Boolean getBuiltIn() {
        return builtIn;
    }

    /**
     * 设置公司内账号
     *
     * @param builtIn 公司内账号
     */
    public void setBuiltIn(Boolean builtIn) {
        this.builtIn = builtIn;
    }

    /**
     * 获取用户来源
     *
     * @return source - 用户来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置用户来源
     *
     * @param source 用户来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取微信openid
     *
     * @return wx_openid - 微信openid
     */
    public String getWxOpenid() {
        return wxOpenid;
    }

    /**
     * 设置微信openid
     *
     * @param wxOpenid 微信openid
     */
    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    /**
     * 获取登录设备台数限制
     *
     * @return devices_limit - 登录设备台数限制
     */
    public Integer getDevicesLimit() {
        return devicesLimit;
    }

    /**
     * 设置登录设备台数限制
     *
     * @param devicesLimit 登录设备台数限制
     */
    public void setDevicesLimit(Integer devicesLimit) {
        this.devicesLimit = devicesLimit;
    }

    /**
     * 获取推广码
     *
     * @return promotion_code - 推广码
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置推广码
     *
     * @param promotionCode 推广码
     */
    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode == null ? null : promotionCode.trim();
    }

    /**
     * 获取推荐人的id
     *
     * @return referrer_id - 推荐人的id
     */
    public Long getReferrerId() {
        return referrerId;
    }

    /**
     * 设置推荐人的id
     *
     * @param referrerId 推荐人的id
     */
    public void setReferrerId(Long referrerId) {
        this.referrerId = referrerId;
    }

    /**
     * 获取分享二维码的URL
     *
     * @return promotion_code_url - 分享二维码的URL
     */
    public String getPromotionCodeUrl() {
        return promotionCodeUrl;
    }

    /**
     * 设置分享二维码的URL
     *
     * @param promotionCodeUrl 分享二维码的URL
     */
    public void setPromotionCodeUrl(String promotionCodeUrl) {
        this.promotionCodeUrl = promotionCodeUrl == null ? null : promotionCodeUrl.trim();
    }

    /**
     * 获取首单完成时间
     *
     * @return first_order_date - 首单完成时间
     */
    public Date getFirstOrderDate() {
        return firstOrderDate;
    }

    /**
     * 设置首单完成时间
     *
     * @param firstOrderDate 首单完成时间
     */
    public void setFirstOrderDate(Date firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    /**
     * 获取第一次登录时间
     *
     * @return first_login_date - 第一次登录时间
     */
    public Date getFirstLoginDate() {
        return firstLoginDate;
    }

    /**
     * 设置第一次登录时间
     *
     * @param firstLoginDate 第一次登录时间
     */
    public void setFirstLoginDate(Date firstLoginDate) {
        this.firstLoginDate = firstLoginDate;
    }

    /**
     * 获取是否精简调度
     *
     * @return manager_lite - 是否精简调度
     */
    public Boolean getManagerLite() {
        return managerLite;
    }

    /**
     * 设置是否精简调度
     *
     * @param managerLite 是否精简调度
     */
    public void setManagerLite(Boolean managerLite) {
        this.managerLite = managerLite;
    }

    /**
     * 获取调度员姓名
     *
     * @return dispatcher_name - 调度员姓名
     */
    public String getDispatcherName() {
        return dispatcherName;
    }

    /**
     * 设置调度员姓名
     *
     * @param dispatcherName 调度员姓名
     */
    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName == null ? null : dispatcherName.trim();
    }

    /**
     * 获取调度员手机号
     *
     * @return dispatcher_phone - 调度员手机号
     */
    public String getDispatcherPhone() {
        return dispatcherPhone;
    }

    /**
     * 设置调度员手机号
     *
     * @param dispatcherPhone 调度员手机号
     */
    public void setDispatcherPhone(String dispatcherPhone) {
        this.dispatcherPhone = dispatcherPhone == null ? null : dispatcherPhone.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", username=").append(username);
        sb.append(", nickname=").append(nickname);
        sb.append(", password=").append(password);
        sb.append(", mobile=").append(mobile);
        sb.append(", mobileValid=").append(mobileValid);
        sb.append(", salt=").append(salt);
        sb.append(", trueName=").append(trueName);
        sb.append(", role=").append(role);
        sb.append(", roleName=").append(roleName);
        sb.append(", weixin=").append(weixin);
        sb.append(", photo=").append(photo);
        sb.append(", customerType=").append(customerType);
        sb.append(", deleted=").append(deleted);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", lastModifiedBy=").append(lastModifiedBy);
        sb.append(", lastModifiedDate=").append(lastModifiedDate);
        sb.append(", status=").append(status);
        sb.append(", token=").append(token);
        sb.append(", orderNum=").append(orderNum);
        sb.append(", rateNum=").append(rateNum);
        sb.append(", rateStar=").append(rateStar);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", address=").append(address);
        sb.append(", company=").append(company);
        sb.append(", version=").append(version);
        sb.append(", csId=").append(csId);
        sb.append(", managerId=").append(managerId);
        sb.append(", orgId=").append(orgId);
        sb.append(", desireEarnest=").append(desireEarnest);
        sb.append(", locked=").append(locked);
        sb.append(", isTest=").append(isTest);
        sb.append(", builtIn=").append(builtIn);
        sb.append(", source=").append(source);
        sb.append(", wxOpenid=").append(wxOpenid);
        sb.append(", devicesLimit=").append(devicesLimit);
        sb.append(", promotionCode=").append(promotionCode);
        sb.append(", referrerId=").append(referrerId);
        sb.append(", promotionCodeUrl=").append(promotionCodeUrl);
        sb.append(", firstOrderDate=").append(firstOrderDate);
        sb.append(", firstLoginDate=").append(firstLoginDate);
        sb.append(", managerLite=").append(managerLite);
        sb.append(", dispatcherName=").append(dispatcherName);
        sb.append(", dispatcherPhone=").append(dispatcherPhone);
        sb.append("]");
        return sb.toString();
    }
}