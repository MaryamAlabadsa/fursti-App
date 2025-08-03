package com.example.myapplication.api;

import com.example.myapplication.api.response.faqResponse.FaqResponse;
import com.example.myapplication.api.response.jobResponse.JobDetailsResponse;
import com.example.myapplication.api.response.jobResponse.JobResponse;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface ApiService {

    // Get all jobs
    @GET("job-seeker/all-jobs")
    Call<JobResponse> getAllJobs(
//            @Query("from_date") String fromDate,
//            @Query("to_date") String toDate,
//            @Query("country_of_graduation") int graduationCountry,
//            @Query("country_of_residence") int residenceCountry,
//            @Query("work_field_id") int workFieldId,
//            @Query("title") String title,
//            @Query("work_place") String workPlace,
//            @Query("gender_perfrence") String genderPreference,
//            @Query("education_level_id") int educationLevelId,
//            @Query("work_experience") int workExperience,
//            @Query("business_man_id") int businessManId
    );
    @GET("faqs")
    Call<FaqResponse> getFaqs();

    // Get policies
    @GET("policies")
    Call<PolicyResponse> getPolicies();
    @GET("job-seeker/job-details/{id}")
    Call<JobDetailsResponse> getJobDetails(@Path("id") int jobId);
}


