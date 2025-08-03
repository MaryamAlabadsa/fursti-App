
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class BusinessMan implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("job_title")
    @Expose
    private Object jobTitle;
    @SerializedName("work_field_id")
    @Expose
    private Object workFieldId;
    @SerializedName("date_of_birth")
    @Expose
    private Object dateOfBirth;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("country_id")
    @Expose
    private Object countryId;
    @SerializedName("nationality")
    @Expose
    private Object nationality;
    @SerializedName("business_name")
    @Expose
    private String businessName;
    @SerializedName("type_business")
    @Expose
    private Integer typeBusiness;
    @SerializedName("employee_no")
    @Expose
    private String employeeNo;
    @SerializedName("user_name")
    @Expose
    private Object userName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("intro_phone")
    @Expose
    private String introPhone;
    @SerializedName("telephone")
    @Expose
    private String telephone;
    @SerializedName("intro_telephone")
    @Expose
    private String introTelephone;
    @SerializedName("email_verified_at")
    @Expose
    private String emailVerifiedAt;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("active_status")
    @Expose
    private Integer activeStatus;
    @SerializedName("verify_code")
    @Expose
    private Object verifyCode;
    @SerializedName("complete_status")
    @Expose
    private Integer completeStatus;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("contact_privacy")
    @Expose
    private Integer contactPrivacy;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("is_from_socialite")
    @Expose
    private Integer isFromSocialite;
    @SerializedName("active_socialite")
    @Expose
    private Integer activeSocialite;
    @SerializedName("fcm_token")
    @Expose
    private Object fcmToken;
    @SerializedName("stripe_id")
    @Expose
    private Object stripeId;
    @SerializedName("pm_type")
    @Expose
    private Object pmType;
    @SerializedName("pm_last_four")
    @Expose
    private Object pmLastFour;
    @SerializedName("trial_ends_at")
    @Expose
    private Object trialEndsAt;
    @SerializedName("business_entity")
    @Expose
    private Object businessEntity;
    @SerializedName("incorporation_year")
    @Expose
    private Object incorporationYear;
    @SerializedName("registration_certificate")
    @Expose
    private Object registrationCertificate;
    @SerializedName("instagram")
    @Expose
    private Object instagram;
    @SerializedName("media")
    @Expose
    private Object media;
    @SerializedName("plan")
    @Expose
    private Object plan;
    @SerializedName("posted_jobs_count")
    @Expose
    private Object postedJobsCount;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("cover_url")
    @Expose
    private String coverUrl;
    @SerializedName("cv_file_url")
    @Expose
    private Object cvFileUrl;
    @SerializedName("experience_years")
    @Expose
    private String experienceYears;
    @SerializedName("number_experience_years")
    @Expose
    private Integer numberExperienceYears;
    @SerializedName("name_with_certifications")
    @Expose
    private Object nameWithCertifications;
    @SerializedName("is_complete")
    @Expose
    private Integer isComplete;
    public final static Creator<BusinessMan> CREATOR = new Creator<BusinessMan>() {


        public BusinessMan createFromParcel(android.os.Parcel in) {
            return new BusinessMan(in);
        }

        public BusinessMan[] newArray(int size) {
            return (new BusinessMan[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3714793526847621143L;

    @SuppressWarnings({
        "unchecked"
    })
    protected BusinessMan(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((Object) in.readValue((Object.class.getClassLoader())));
        this.jobTitle = ((Object) in.readValue((Object.class.getClassLoader())));
        this.workFieldId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.dateOfBirth = ((Object) in.readValue((Object.class.getClassLoader())));
        this.gender = ((Object) in.readValue((Object.class.getClassLoader())));
        this.countryId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.nationality = ((Object) in.readValue((Object.class.getClassLoader())));
        this.businessName = ((String) in.readValue((String.class.getClassLoader())));
        this.typeBusiness = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.employeeNo = ((String) in.readValue((String.class.getClassLoader())));
        this.userName = ((Object) in.readValue((Object.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.phone = ((String) in.readValue((String.class.getClassLoader())));
        this.introPhone = ((String) in.readValue((String.class.getClassLoader())));
        this.telephone = ((String) in.readValue((String.class.getClassLoader())));
        this.introTelephone = ((String) in.readValue((String.class.getClassLoader())));
        this.emailVerifiedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.roleId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.createdAt = ((String) in.readValue((String.class.getClassLoader())));
        this.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
        this.activeStatus = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.verifyCode = ((Object) in.readValue((Object.class.getClassLoader())));
        this.completeStatus = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.website = ((String) in.readValue((String.class.getClassLoader())));
        this.contactPrivacy = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.bio = ((String) in.readValue((String.class.getClassLoader())));
        this.isFromSocialite = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.activeSocialite = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.fcmToken = ((Object) in.readValue((Object.class.getClassLoader())));
        this.stripeId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.pmType = ((Object) in.readValue((Object.class.getClassLoader())));
        this.pmLastFour = ((Object) in.readValue((Object.class.getClassLoader())));
        this.trialEndsAt = ((Object) in.readValue((Object.class.getClassLoader())));
        this.businessEntity = ((Object) in.readValue((Object.class.getClassLoader())));
        this.incorporationYear = ((Object) in.readValue((Object.class.getClassLoader())));
        this.registrationCertificate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.instagram = ((Object) in.readValue((Object.class.getClassLoader())));
        this.media = ((Object) in.readValue((Object.class.getClassLoader())));
        this.plan = ((Object) in.readValue((Object.class.getClassLoader())));
        this.postedJobsCount = ((Object) in.readValue((Object.class.getClassLoader())));
        this.imageUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.coverUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.cvFileUrl = ((Object) in.readValue((Object.class.getClassLoader())));
        this.experienceYears = ((String) in.readValue((String.class.getClassLoader())));
        this.numberExperienceYears = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nameWithCertifications = ((Object) in.readValue((Object.class.getClassLoader())));
        this.isComplete = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    public BusinessMan() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(Object jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Object getWorkFieldId() {
        return workFieldId;
    }

    public void setWorkFieldId(Object workFieldId) {
        this.workFieldId = workFieldId;
    }

    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getCountryId() {
        return countryId;
    }

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    public Object getNationality() {
        return nationality;
    }

    public void setNationality(Object nationality) {
        this.nationality = nationality;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getTypeBusiness() {
        return typeBusiness;
    }

    public void setTypeBusiness(Integer typeBusiness) {
        this.typeBusiness = typeBusiness;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIntroPhone() {
        return introPhone;
    }

    public void setIntroPhone(String introPhone) {
        this.introPhone = introPhone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getIntroTelephone() {
        return introTelephone;
    }

    public void setIntroTelephone(String introTelephone) {
        this.introTelephone = introTelephone;
    }

    public String getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(String emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Object getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(Object verifyCode) {
        this.verifyCode = verifyCode;
    }

    public Integer getCompleteStatus() {
        return completeStatus;
    }

    public void setCompleteStatus(Integer completeStatus) {
        this.completeStatus = completeStatus;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getContactPrivacy() {
        return contactPrivacy;
    }

    public void setContactPrivacy(Integer contactPrivacy) {
        this.contactPrivacy = contactPrivacy;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Integer getIsFromSocialite() {
        return isFromSocialite;
    }

    public void setIsFromSocialite(Integer isFromSocialite) {
        this.isFromSocialite = isFromSocialite;
    }

    public Integer getActiveSocialite() {
        return activeSocialite;
    }

    public void setActiveSocialite(Integer activeSocialite) {
        this.activeSocialite = activeSocialite;
    }

    public Object getFcmToken() {
        return fcmToken;
    }

    public void setFcmToken(Object fcmToken) {
        this.fcmToken = fcmToken;
    }

    public Object getStripeId() {
        return stripeId;
    }

    public void setStripeId(Object stripeId) {
        this.stripeId = stripeId;
    }

    public Object getPmType() {
        return pmType;
    }

    public void setPmType(Object pmType) {
        this.pmType = pmType;
    }

    public Object getPmLastFour() {
        return pmLastFour;
    }

    public void setPmLastFour(Object pmLastFour) {
        this.pmLastFour = pmLastFour;
    }

    public Object getTrialEndsAt() {
        return trialEndsAt;
    }

    public void setTrialEndsAt(Object trialEndsAt) {
        this.trialEndsAt = trialEndsAt;
    }

    public Object getBusinessEntity() {
        return businessEntity;
    }

    public void setBusinessEntity(Object businessEntity) {
        this.businessEntity = businessEntity;
    }

    public Object getIncorporationYear() {
        return incorporationYear;
    }

    public void setIncorporationYear(Object incorporationYear) {
        this.incorporationYear = incorporationYear;
    }

    public Object getRegistrationCertificate() {
        return registrationCertificate;
    }

    public void setRegistrationCertificate(Object registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
    }

    public Object getInstagram() {
        return instagram;
    }

    public void setInstagram(Object instagram) {
        this.instagram = instagram;
    }

    public Object getMedia() {
        return media;
    }

    public void setMedia(Object media) {
        this.media = media;
    }

    public Object getPlan() {
        return plan;
    }

    public void setPlan(Object plan) {
        this.plan = plan;
    }

    public Object getPostedJobsCount() {
        return postedJobsCount;
    }

    public void setPostedJobsCount(Object postedJobsCount) {
        this.postedJobsCount = postedJobsCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public Object getCvFileUrl() {
        return cvFileUrl;
    }

    public void setCvFileUrl(Object cvFileUrl) {
        this.cvFileUrl = cvFileUrl;
    }

    public String getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(String experienceYears) {
        this.experienceYears = experienceYears;
    }

    public Integer getNumberExperienceYears() {
        return numberExperienceYears;
    }

    public void setNumberExperienceYears(Integer numberExperienceYears) {
        this.numberExperienceYears = numberExperienceYears;
    }

    public Object getNameWithCertifications() {
        return nameWithCertifications;
    }

    public void setNameWithCertifications(Object nameWithCertifications) {
        this.nameWithCertifications = nameWithCertifications;
    }

    public Integer getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BusinessMan.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("workFieldId");
        sb.append('=');
        sb.append(((this.workFieldId == null)?"<null>":this.workFieldId));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("gender");
        sb.append('=');
        sb.append(((this.gender == null)?"<null>":this.gender));
        sb.append(',');
        sb.append("countryId");
        sb.append('=');
        sb.append(((this.countryId == null)?"<null>":this.countryId));
        sb.append(',');
        sb.append("nationality");
        sb.append('=');
        sb.append(((this.nationality == null)?"<null>":this.nationality));
        sb.append(',');
        sb.append("businessName");
        sb.append('=');
        sb.append(((this.businessName == null)?"<null>":this.businessName));
        sb.append(',');
        sb.append("typeBusiness");
        sb.append('=');
        sb.append(((this.typeBusiness == null)?"<null>":this.typeBusiness));
        sb.append(',');
        sb.append("employeeNo");
        sb.append('=');
        sb.append(((this.employeeNo == null)?"<null>":this.employeeNo));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("phone");
        sb.append('=');
        sb.append(((this.phone == null)?"<null>":this.phone));
        sb.append(',');
        sb.append("introPhone");
        sb.append('=');
        sb.append(((this.introPhone == null)?"<null>":this.introPhone));
        sb.append(',');
        sb.append("telephone");
        sb.append('=');
        sb.append(((this.telephone == null)?"<null>":this.telephone));
        sb.append(',');
        sb.append("introTelephone");
        sb.append('=');
        sb.append(((this.introTelephone == null)?"<null>":this.introTelephone));
        sb.append(',');
        sb.append("emailVerifiedAt");
        sb.append('=');
        sb.append(((this.emailVerifiedAt == null)?"<null>":this.emailVerifiedAt));
        sb.append(',');
        sb.append("roleId");
        sb.append('=');
        sb.append(((this.roleId == null)?"<null>":this.roleId));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("activeStatus");
        sb.append('=');
        sb.append(((this.activeStatus == null)?"<null>":this.activeStatus));
        sb.append(',');
        sb.append("verifyCode");
        sb.append('=');
        sb.append(((this.verifyCode == null)?"<null>":this.verifyCode));
        sb.append(',');
        sb.append("completeStatus");
        sb.append('=');
        sb.append(((this.completeStatus == null)?"<null>":this.completeStatus));
        sb.append(',');
        sb.append("website");
        sb.append('=');
        sb.append(((this.website == null)?"<null>":this.website));
        sb.append(',');
        sb.append("contactPrivacy");
        sb.append('=');
        sb.append(((this.contactPrivacy == null)?"<null>":this.contactPrivacy));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("isFromSocialite");
        sb.append('=');
        sb.append(((this.isFromSocialite == null)?"<null>":this.isFromSocialite));
        sb.append(',');
        sb.append("activeSocialite");
        sb.append('=');
        sb.append(((this.activeSocialite == null)?"<null>":this.activeSocialite));
        sb.append(',');
        sb.append("fcmToken");
        sb.append('=');
        sb.append(((this.fcmToken == null)?"<null>":this.fcmToken));
        sb.append(',');
        sb.append("stripeId");
        sb.append('=');
        sb.append(((this.stripeId == null)?"<null>":this.stripeId));
        sb.append(',');
        sb.append("pmType");
        sb.append('=');
        sb.append(((this.pmType == null)?"<null>":this.pmType));
        sb.append(',');
        sb.append("pmLastFour");
        sb.append('=');
        sb.append(((this.pmLastFour == null)?"<null>":this.pmLastFour));
        sb.append(',');
        sb.append("trialEndsAt");
        sb.append('=');
        sb.append(((this.trialEndsAt == null)?"<null>":this.trialEndsAt));
        sb.append(',');
        sb.append("businessEntity");
        sb.append('=');
        sb.append(((this.businessEntity == null)?"<null>":this.businessEntity));
        sb.append(',');
        sb.append("incorporationYear");
        sb.append('=');
        sb.append(((this.incorporationYear == null)?"<null>":this.incorporationYear));
        sb.append(',');
        sb.append("registrationCertificate");
        sb.append('=');
        sb.append(((this.registrationCertificate == null)?"<null>":this.registrationCertificate));
        sb.append(',');
        sb.append("instagram");
        sb.append('=');
        sb.append(((this.instagram == null)?"<null>":this.instagram));
        sb.append(',');
        sb.append("media");
        sb.append('=');
        sb.append(((this.media == null)?"<null>":this.media));
        sb.append(',');
        sb.append("plan");
        sb.append('=');
        sb.append(((this.plan == null)?"<null>":this.plan));
        sb.append(',');
        sb.append("postedJobsCount");
        sb.append('=');
        sb.append(((this.postedJobsCount == null)?"<null>":this.postedJobsCount));
        sb.append(',');
        sb.append("imageUrl");
        sb.append('=');
        sb.append(((this.imageUrl == null)?"<null>":this.imageUrl));
        sb.append(',');
        sb.append("coverUrl");
        sb.append('=');
        sb.append(((this.coverUrl == null)?"<null>":this.coverUrl));
        sb.append(',');
        sb.append("cvFileUrl");
        sb.append('=');
        sb.append(((this.cvFileUrl == null)?"<null>":this.cvFileUrl));
        sb.append(',');
        sb.append("experienceYears");
        sb.append('=');
        sb.append(((this.experienceYears == null)?"<null>":this.experienceYears));
        sb.append(',');
        sb.append("numberExperienceYears");
        sb.append('=');
        sb.append(((this.numberExperienceYears == null)?"<null>":this.numberExperienceYears));
        sb.append(',');
        sb.append("nameWithCertifications");
        sb.append('=');
        sb.append(((this.nameWithCertifications == null)?"<null>":this.nameWithCertifications));
        sb.append(',');
        sb.append("isComplete");
        sb.append('=');
        sb.append(((this.isComplete == null)?"<null>":this.isComplete));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(jobTitle);
        dest.writeValue(workFieldId);
        dest.writeValue(dateOfBirth);
        dest.writeValue(gender);
        dest.writeValue(countryId);
        dest.writeValue(nationality);
        dest.writeValue(businessName);
        dest.writeValue(typeBusiness);
        dest.writeValue(employeeNo);
        dest.writeValue(userName);
        dest.writeValue(email);
        dest.writeValue(phone);
        dest.writeValue(introPhone);
        dest.writeValue(telephone);
        dest.writeValue(introTelephone);
        dest.writeValue(emailVerifiedAt);
        dest.writeValue(roleId);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(activeStatus);
        dest.writeValue(verifyCode);
        dest.writeValue(completeStatus);
        dest.writeValue(website);
        dest.writeValue(contactPrivacy);
        dest.writeValue(bio);
        dest.writeValue(isFromSocialite);
        dest.writeValue(activeSocialite);
        dest.writeValue(fcmToken);
        dest.writeValue(stripeId);
        dest.writeValue(pmType);
        dest.writeValue(pmLastFour);
        dest.writeValue(trialEndsAt);
        dest.writeValue(businessEntity);
        dest.writeValue(incorporationYear);
        dest.writeValue(registrationCertificate);
        dest.writeValue(instagram);
        dest.writeValue(media);
        dest.writeValue(plan);
        dest.writeValue(postedJobsCount);
        dest.writeValue(imageUrl);
        dest.writeValue(coverUrl);
        dest.writeValue(cvFileUrl);
        dest.writeValue(experienceYears);
        dest.writeValue(numberExperienceYears);
        dest.writeValue(nameWithCertifications);
        dest.writeValue(isComplete);
    }

    public int describeContents() {
        return  0;
    }

}
