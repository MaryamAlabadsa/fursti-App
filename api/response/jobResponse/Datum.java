
package com.example.myapplication.api.response.jobResponse;

import java.io.Serializable;
import java.util.List;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class Datum implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("employment_type")
    @Expose
    private String employmentType;
    @SerializedName("work_field_id")
    @Expose
    private Integer workFieldId;
    @SerializedName("work_place")
    @Expose
    private String workPlace;
    @SerializedName("country_of_employment")
    @Expose
    private CountryOfEmployment countryOfEmployment;
    @SerializedName("salary")
    @Expose
    private Object salary;
    @SerializedName("salary_show")
    @Expose
    private Integer salaryShow;
    @SerializedName("work_experience")
    @Expose
    private Integer workExperience;
    @SerializedName("job_valid_unite")
    @Expose
    private String jobValidUnite;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("nationality_prefrence")
    @Expose
    private Object nationalityPrefrence;
    @SerializedName("country_of_residence")
    @Expose
    private Object countryOfResidence;
    @SerializedName("gender_perfrence")
    @Expose
    private Object genderPerfrence;
    @SerializedName("request_vedio")
    @Expose
    private Integer requestVedio;
    @SerializedName("question")
    @Expose
    private Object question;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("business_man_id")
    @Expose
    private Integer businessManId;
    @SerializedName("currency_id")
    @Expose
    private Object currencyId;
    @SerializedName("pay_status")
    @Expose
    private Integer payStatus;
    @SerializedName("education_level_id")
    @Expose
    private Integer educationLevelId;
    @SerializedName("education_feild_id")
    @Expose
    private Integer educationFeildId;
    @SerializedName("certification_id")
    @Expose
    private Integer certificationId;
    @SerializedName("file_description")
    @Expose
    private Object fileDescription;
    @SerializedName("country_of_graduation")
    @Expose
    private Object countryOfGraduation;
    @SerializedName("create_time")
    @Expose
    private String createTime;
    @SerializedName("expire_date")
    @Expose
    private Integer expireDate;
    @SerializedName("applicants")
    @Expose
    private Integer applicants;
    @SerializedName("invited")
    @Expose
    private List<Object> invited;
    @SerializedName("watches_count")
    @Expose
    private Integer watchesCount;
    @SerializedName("is_favorite")
    @Expose
    private Boolean isFavorite;
    @SerializedName("is_applied")
    @Expose
    private Boolean isApplied;
    @SerializedName("watches")
    @Expose
    private List<Watch> watches;
    @SerializedName("education_level")
    @Expose
    private EducationLevel educationLevel;
    @SerializedName("education_feild")
    @Expose
    private EducationFeild educationFeild;
    @SerializedName("certification")
    @Expose
    private Certification certification;
    @SerializedName("experience_year")
    @Expose
    private ExperienceYear experienceYear;
    @SerializedName("business_man")
    @Expose
    private BusinessMan businessMan;
    @SerializedName("currency")
    @Expose
    private Object currency;
    @SerializedName("skills")
    @Expose
    private List<Skill> skills;
    @SerializedName("work_field")
    @Expose
    private WorkField workField;
    public final static Creator<Datum> CREATOR = new Creator<Datum>() {


        public Datum createFromParcel(android.os.Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

    }
    ;
    private final static long serialVersionUID = -5829866525798351008L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Datum(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.employmentType = ((String) in.readValue((String.class.getClassLoader())));
        this.workFieldId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.workPlace = ((String) in.readValue((String.class.getClassLoader())));
        this.countryOfEmployment = ((CountryOfEmployment) in.readValue((CountryOfEmployment.class.getClassLoader())));
        this.salary = ((Object) in.readValue((Object.class.getClassLoader())));
        this.salaryShow = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.workExperience = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.jobValidUnite = ((String) in.readValue((String.class.getClassLoader())));
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
        this.nationalityPrefrence = ((Object) in.readValue((Object.class.getClassLoader())));
        this.countryOfResidence = ((Object) in.readValue((Object.class.getClassLoader())));
        this.genderPerfrence = ((Object) in.readValue((Object.class.getClassLoader())));
        this.requestVedio = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.question = ((Object) in.readValue((Object.class.getClassLoader())));
        this.status = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.businessManId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.currencyId = ((Object) in.readValue((Object.class.getClassLoader())));
        this.payStatus = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.educationLevelId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.educationFeildId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.certificationId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.fileDescription = ((Object) in.readValue((Object.class.getClassLoader())));
        this.countryOfGraduation = ((Object) in.readValue((Object.class.getClassLoader())));
        this.createTime = ((String) in.readValue((String.class.getClassLoader())));
        this.expireDate = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.applicants = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.invited, (Object.class.getClassLoader()));
        this.watchesCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.isFavorite = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.isApplied = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.watches, (Watch.class.getClassLoader()));
        this.educationLevel = ((EducationLevel) in.readValue((EducationLevel.class.getClassLoader())));
        this.educationFeild = ((EducationFeild) in.readValue((EducationFeild.class.getClassLoader())));
        this.certification = ((Certification) in.readValue((Certification.class.getClassLoader())));
        this.experienceYear = ((ExperienceYear) in.readValue((ExperienceYear.class.getClassLoader())));
        this.businessMan = ((BusinessMan) in.readValue((BusinessMan.class.getClassLoader())));
        this.currency = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.skills, (Skill.class.getClassLoader()));
        this.workField = ((WorkField) in.readValue((WorkField.class.getClassLoader())));
    }

    public Datum() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public Integer getWorkFieldId() {
        return workFieldId;
    }

    public void setWorkFieldId(Integer workFieldId) {
        this.workFieldId = workFieldId;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public CountryOfEmployment getCountryOfEmployment() {
        return countryOfEmployment;
    }

    public void setCountryOfEmployment(CountryOfEmployment countryOfEmployment) {
        this.countryOfEmployment = countryOfEmployment;
    }

    public Object getSalary() {
        return salary;
    }

    public void setSalary(Object salary) {
        this.salary = salary;
    }

    public Integer getSalaryShow() {
        return salaryShow;
    }

    public void setSalaryShow(Integer salaryShow) {
        this.salaryShow = salaryShow;
    }

    public Integer getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }

    public String getJobValidUnite() {
        return jobValidUnite;
    }

    public void setJobValidUnite(String jobValidUnite) {
        this.jobValidUnite = jobValidUnite;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Object getNationalityPrefrence() {
        return nationalityPrefrence;
    }

    public void setNationalityPrefrence(Object nationalityPrefrence) {
        this.nationalityPrefrence = nationalityPrefrence;
    }

    public Object getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(Object countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public Object getGenderPerfrence() {
        return genderPerfrence;
    }

    public void setGenderPerfrence(Object genderPerfrence) {
        this.genderPerfrence = genderPerfrence;
    }

    public Integer getRequestVedio() {
        return requestVedio;
    }

    public void setRequestVedio(Integer requestVedio) {
        this.requestVedio = requestVedio;
    }

    public Object getQuestion() {
        return question;
    }

    public void setQuestion(Object question) {
        this.question = question;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBusinessManId() {
        return businessManId;
    }

    public void setBusinessManId(Integer businessManId) {
        this.businessManId = businessManId;
    }

    public Object getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Object currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getEducationLevelId() {
        return educationLevelId;
    }

    public void setEducationLevelId(Integer educationLevelId) {
        this.educationLevelId = educationLevelId;
    }

    public Integer getEducationFeildId() {
        return educationFeildId;
    }

    public void setEducationFeildId(Integer educationFeildId) {
        this.educationFeildId = educationFeildId;
    }

    public Integer getCertificationId() {
        return certificationId;
    }

    public void setCertificationId(Integer certificationId) {
        this.certificationId = certificationId;
    }

    public Object getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(Object fileDescription) {
        this.fileDescription = fileDescription;
    }

    public Object getCountryOfGraduation() {
        return countryOfGraduation;
    }

    public void setCountryOfGraduation(Object countryOfGraduation) {
        this.countryOfGraduation = countryOfGraduation;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Integer expireDate) {
        this.expireDate = expireDate;
    }

    public Integer getApplicants() {
        return applicants;
    }

    public void setApplicants(Integer applicants) {
        this.applicants = applicants;
    }

    public List<Object> getInvited() {
        return invited;
    }

    public void setInvited(List<Object> invited) {
        this.invited = invited;
    }

    public Integer getWatchesCount() {
        return watchesCount;
    }

    public void setWatchesCount(Integer watchesCount) {
        this.watchesCount = watchesCount;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public Boolean getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public List<Watch> getWatches() {
        return watches;
    }

    public void setWatches(List<Watch> watches) {
        this.watches = watches;
    }

    public EducationLevel getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(EducationLevel educationLevel) {
        this.educationLevel = educationLevel;
    }

    public EducationFeild getEducationFeild() {
        return educationFeild;
    }

    public void setEducationFeild(EducationFeild educationFeild) {
        this.educationFeild = educationFeild;
    }

    public Certification getCertification() {
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    public ExperienceYear getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(ExperienceYear experienceYear) {
        this.experienceYear = experienceYear;
    }

    public BusinessMan getBusinessMan() {
        return businessMan;
    }

    public void setBusinessMan(BusinessMan businessMan) {
        this.businessMan = businessMan;
    }

    public Object getCurrency() {
        return currency;
    }

    public void setCurrency(Object currency) {
        this.currency = currency;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public WorkField getWorkField() {
        return workField;
    }

    public void setWorkField(WorkField workField) {
        this.workField = workField;
    }


    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(employmentType);
        dest.writeValue(workFieldId);
        dest.writeValue(workPlace);
        dest.writeValue(countryOfEmployment);
        dest.writeValue(salary);
        dest.writeValue(salaryShow);
        dest.writeValue(workExperience);
        dest.writeValue(jobValidUnite);
        dest.writeValue(summary);
        dest.writeValue(nationalityPrefrence);
        dest.writeValue(countryOfResidence);
        dest.writeValue(genderPerfrence);
        dest.writeValue(requestVedio);
        dest.writeValue(question);
        dest.writeValue(status);
        dest.writeValue(businessManId);
        dest.writeValue(currencyId);
        dest.writeValue(payStatus);
        dest.writeValue(educationLevelId);
        dest.writeValue(educationFeildId);
        dest.writeValue(certificationId);
        dest.writeValue(fileDescription);
        dest.writeValue(countryOfGraduation);
        dest.writeValue(createTime);
        dest.writeValue(expireDate);
        dest.writeValue(applicants);
        dest.writeList(invited);
        dest.writeValue(watchesCount);
        dest.writeValue(isFavorite);
        dest.writeValue(isApplied);
        dest.writeList(watches);
        dest.writeValue(educationLevel);
        dest.writeValue(educationFeild);
        dest.writeValue(certification);
        dest.writeValue(experienceYear);
        dest.writeValue(businessMan);
        dest.writeValue(currency);
        dest.writeList(skills);
        dest.writeValue(workField);
    }

    public int describeContents() {
        return  0;
    }

}
