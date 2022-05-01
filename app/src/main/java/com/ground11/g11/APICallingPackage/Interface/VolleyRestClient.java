package com.ground11.g11.APICallingPackage.Interface;

import android.app.Activity;
import android.content.Context;

import com.ground11.g11.APICallingPackage.Class.APIRequestManager;

import org.json.JSONObject;

import java.io.File;


public interface VolleyRestClient
{
    public void callGetRestApi(String url, Context mContext, Activity activity, String type,
                               ServerResponseListner serverResponseListner, boolean isShowProgress);

    public void callRestApi(String url, JSONObject jsonObject, Context mContext, Activity activity,
                            String type, APIRequestManager serverResponseListner,
                            boolean isShowProgress);

    void callRestApi(String url, JSONObject jsonObject, Context mContext,
                     Activity activity, String type,
                     ServerResponseListner serverResponseListner,
                     boolean isShowProgress);

    public void calluploadImageApi(Context mContext, String url, File imagefile, String sessionKey,
                                   String section,
                                   String entityGuid, String caption, String type,
                                   ServerResponseListner serverResponseListner);

//    void callGetRestApi(String url, Context mContext,
//                        Activity activity, String type,
//                        com.ground11.g11.APICallingPackage.Interface.ServerResponseListner serverResponseListner, boolean isShowProgress);
//
//    void callRestApi(String url, JSONObject jsonObject, Context mContext,
//                     Activity activity, String type,
//                     com.indian11.app.APICallingPackage.Interface.ServerResponseListner serverResponseListner,
//                     boolean isShowProgress);
//
//    void calluploadImageApi(Context mContext, String url, File imagefile, String sessionKey, String section, String entityGuid, String caption, String type, com.indian11.app.APICallingPackage.Interface.ServerResponseListner serverResponseListner);
//
//    public void callBackmanager(int requestcode, int resultcode, Intent data);

}
