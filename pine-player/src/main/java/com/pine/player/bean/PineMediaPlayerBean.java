package com.pine.player.bean;

import android.net.Uri;
import android.support.annotation.NonNull;

import com.pine.player.applet.IPinePlayerPlugin;
import com.pine.player.decrytor.IPineMediaDecryptor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanghongfeng on 2017/9/18.
 */

/**
 * 播放参数
 */
public class PineMediaPlayerBean {
    public final static int MEDIA_TYPE_VIDEO = 1;
    public final static int MEDIA_TYPE_AUDIO = 2;

    @NonNull
    private String mediaCode;
    @NonNull
    private String mediaName;
    @NonNull
    private ArrayList<Uri> mediaUriList;
    private int mediaType = MEDIA_TYPE_VIDEO;
    private Uri mediaImgUri;
    private List<IPinePlayerPlugin> playerPluginList;
    private IPineMediaDecryptor playerDecryptor;

    public PineMediaPlayerBean(@NonNull String mediaCode, @NonNull String mediaName,
                               @NonNull Uri mediaUri) {
        this(mediaCode, mediaName, mediaUri, MEDIA_TYPE_VIDEO, null, null, null);
    }

    public PineMediaPlayerBean(@NonNull String mediaCode, @NonNull String mediaName,
                               @NonNull ArrayList<Uri> mediaUriList) {
        this(mediaCode, mediaName, mediaUriList, MEDIA_TYPE_VIDEO, null, null, null);
    }

    public PineMediaPlayerBean(@NonNull String mediaCode, @NonNull String mediaName,
                               @NonNull Uri mediaUri, int mediaType) {
        this(mediaCode, mediaName, mediaUri, mediaType, null, null, null);
    }

    public PineMediaPlayerBean(@NonNull String mediaCode, @NonNull String mediaName,
                               @NonNull ArrayList<Uri> mediaUriList, int mediaType) {
        this(mediaCode, mediaName, mediaUriList, mediaType, null, null, null);
    }

    /**
     * @param mediaCode        media标识编码 不可为null，用于区分不同的视频
     * @param mediaName        media名称 不可为null
     * @param mediaUri         media文件Uri 不可为null
     * @param mediaType        media类型 默认为MEDIA_TYPE_VIDEO
     * @param mediaImgUri      media图片Uri 可为null
     * @param playerPluginList media解密器 可为null
     * @param playerDecryptor  media解密器 可为null
     */
    public PineMediaPlayerBean(String mediaCode, String mediaName, Uri mediaUri,
                               int mediaType, Uri mediaImgUri,
                               List<IPinePlayerPlugin> playerPluginList,
                               IPineMediaDecryptor playerDecryptor) {
        this.mediaCode = mediaCode;
        this.mediaName = mediaName;
        this.mediaUriList = new ArrayList<Uri>();
        this.mediaUriList.add(mediaUri);
        if (mediaType == MEDIA_TYPE_VIDEO || mediaType == MEDIA_TYPE_AUDIO) {
            this.mediaType = mediaType;
        } else {
            this.mediaType = MEDIA_TYPE_VIDEO;
        }
        this.mediaImgUri = mediaImgUri;
        this.playerPluginList = playerPluginList;
        this.playerDecryptor = playerDecryptor;
    }

    /**
     * @param mediaCode        media标识编码 不可为null，用于区分不同的视频
     * @param mediaName        media名称 不可为null
     * @param mediaUriList    media各个清晰度对应的文件Uri列表 不可为null
     * @param mediaType        media类型 默认为MEDIA_TYPE_VIDEO
     * @param mediaImgUri      media图片Uri 可为null
     * @param playerPluginList media解密器 可为null
     * @param playerDecryptor  media解密器 可为null
     */
    public PineMediaPlayerBean(String mediaCode, String mediaName, ArrayList<Uri> mediaUriList,
                               int mediaType, Uri mediaImgUri,
                               List<IPinePlayerPlugin> playerPluginList,
                               IPineMediaDecryptor playerDecryptor) {
        this.mediaCode = mediaCode;
        this.mediaName = mediaName;
        this.mediaUriList = mediaUriList;
        if (mediaType == MEDIA_TYPE_VIDEO || mediaType == MEDIA_TYPE_AUDIO) {
            this.mediaType = mediaType;
        } else {
            this.mediaType = MEDIA_TYPE_VIDEO;
        }
        this.mediaImgUri = mediaImgUri;
        this.playerPluginList = playerPluginList;
        this.playerDecryptor = playerDecryptor;
    }

    public String getMediaCode() {
        return mediaCode;
    }

    public void setMediaCode(String mediaCode) {
        this.mediaCode = mediaCode;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public Uri getMediaUri() {
        return getMediaUri(0);
    }

    public Uri getMediaUri(int index) {
        if (mediaUriList == null || index >= mediaUriList.size()) {
            return null;
        } else {
            return mediaUriList.get(index);
        }
    }

    public ArrayList<Uri> getMediaUriList() {
        return mediaUriList;
    }

    public void setMediaUriList(ArrayList<Uri> mediaUriList) {
        this.mediaUriList = mediaUriList;
    }

    public int getMediaType() {
        return mediaType;
    }

    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public Uri getMediaImgUri() {
        return mediaImgUri;
    }

    public void setMediaImgUri(Uri mediaImgUri) {
        this.mediaImgUri = mediaImgUri;
    }

    public List<IPinePlayerPlugin> getPlayerPluginList() {
        return this.playerPluginList;
    }

    public void setPlayerPluginList(List<IPinePlayerPlugin> playerPluginList) {
        this.playerPluginList = playerPluginList;
    }

    public IPineMediaDecryptor getPlayerDecryptor() {
        return this.playerDecryptor;
    }

    public void setPlayerDecryptor(IPineMediaDecryptor playerDecryptor) {
        this.playerDecryptor = playerDecryptor;
    }

    public String toString() {
        String mediaUriListStr = null;
        if (mediaUriList != null && mediaUriList.size() > 0) {
            mediaUriListStr = "[" + mediaUriList.get(0);
            for (int i = 0; i < mediaUriList.size(); i++) {
                mediaUriListStr +=  "," + mediaUriList.get(i);
            }
            mediaUriListStr += "]";
        }
        return "PineMediaPlayerBean:{" +
                "mediaCode:" + mediaCode +
                ",mediaName:" + mediaName +
                ",mediaUriList:" + mediaUriList +
                ",mediaType:" + mediaType +
                ",mediaImgUri:" + mediaUriListStr +
                ",playerPluginList:" + playerPluginList +
                ",playerDecryptor:" + playerDecryptor;
    }
}
