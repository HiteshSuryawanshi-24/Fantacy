package com.ground11.g11.APICallingPackage.Class;

import android.content.Context;

import com.ground11.g11.APICallingPackage.Interface.ResponseManager;
import com.ground11.g11.APICallingPackage.Interface.ServerResponseListner;
import com.ground11.g11.APICallingPackage.Interface.VolleyRestClient;

import org.json.JSONObject;


public class APIRequestManager implements ServerResponseListner {



    Context mContext;
    ResponseManager responseManager;
    private VolleyRestClient volleyRestClient;

    public APIRequestManager(Context mContext) {
        this.mContext = mContext;

    }


    public void callAPI(String url, JSONObject jsonObject, Context mContext, Activity activity,
                        String type, boolean isShowProgress,
                        ResponseManager responseManager) throws JSONException {
        this.responseManager = responseManager;
        volleyRestClient = new VolleyApiCalling() {
            @Override
            public void calluploadImageApi(Context mContext, String url, File imagefile, String sessionKey, String section, String entityGuid, String caption, String type, ServerResponseListner serverResponseListner) {

            }

            @Override
            public void callGetRestApi(String url, Context mContext, Activity activity, String type, ServerResponseListner serverResponseListner, boolean isShowProgress) {

            }

            @Override
            public void callRestApi(String url, JSONObject jsonObject, Context mContext, Activity activity, String type, com.indian11.app.APICallingPackage.Interface.ServerResponseListner serverResponseListner, boolean isShowProgress) {

            }

            @Override
            public void callRestApi(String url, JSONObject jsonObject, Context mContext, Activity activity, String type, com.ground11.g11.APICallingPackage.Interface.ServerResponseListner serverResponseListner, boolean isShowProgress) {

            }

            @Override
            public void calluploadImageApi(Context mContext, String url, File imagefile, String sessionKey, String section, String entityGuid, String caption, String type, com.indian11.app.APICallingPackage.Interface.ServerResponseListner serverResponseListner) {

            }
        };
        volleyRestClient.callRestApi(url, jsonObject, mContext, activity, type,
                this, isShowProgress);

    }


    @Override
    public void onSucess(JSONObject response, String type, String message) {


        //Response only consist data object/array/string

        if (response != null && !response.equals("")) {
            try {

                responseManager.getResult(mContext,type,message,response);

            }
            catch (Exception e){
                e.printStackTrace();
            }
            }



    }

    @Override
    public void onError(String error, String type) {
            responseManager.onError(mContext,type,error);

    }
}
