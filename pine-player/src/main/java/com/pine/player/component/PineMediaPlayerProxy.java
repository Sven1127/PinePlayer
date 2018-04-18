package com.pine.player.component;

import android.media.MediaPlayer;
import android.support.annotation.NonNull;

import com.pine.player.bean.PineMediaPlayerBean;
import com.pine.player.widget.PineMediaPlayerView;
import com.pine.player.widget.PineSurfaceView;

import java.util.Map;

/**
 * Created by tanghongfeng on 2018/4/2.
 */

public class PineMediaPlayerProxy implements PineMediaWidget.IPineMediaPlayer {
    private PineMediaPlayerComponent mMediaPlayerComponent;
    private String mMediaPlayerTag;

    public PineMediaPlayerProxy(String tag, @NonNull PineMediaPlayerComponent pineMediaPlayerComponent) {
        mMediaPlayerTag = tag;
        mMediaPlayerComponent = pineMediaPlayerComponent;
    }

    public String getMediaPlayerTag() {
        return mMediaPlayerTag;
    }

    public PineMediaPlayerComponent getPineMediaPlayerComponent() {
        return mMediaPlayerComponent;
    }

    public void setPineMediaPlayerComponent(String tag, PineMediaPlayerComponent mediaPlayerComponent) {
        mMediaPlayerTag = tag;
        mMediaPlayerComponent = mediaPlayerComponent;
    }

    @Override
    public float getSpeed() {
        return mMediaPlayerComponent.getSpeed();
    }

    @Override
    public void setSpeed(float speed) {
        mMediaPlayerComponent.setSpeed(speed);
    }

    @Override
    public void start() {
        mMediaPlayerComponent.start();
    }

    @Override
    public void pause() {
        mMediaPlayerComponent.pause();
    }

    @Override
    public void suspend() {
        mMediaPlayerComponent.suspend();
    }

    @Override
    public void resume() {
        mMediaPlayerComponent.resume();
    }

    @Override
    public void release() {
        mMediaPlayerComponent.release();
    }

    @Override
    public void onDestroy() {
        mMediaPlayerComponent.onDestroy();
    }

    @Override
    public boolean isLocalStreamMode() {
        return mMediaPlayerComponent.isLocalStreamMode();
    }
    @Override
    public void setAutocephalyPlayMode(boolean isAutocephalyPlayMode) {
        mMediaPlayerComponent.setAutocephalyPlayMode(isAutocephalyPlayMode);
    }

    @Override
    public void setPlayingMedia(PineMediaPlayerBean pineMediaPlayerBean) {
        mMediaPlayerComponent.setPlayingMedia(pineMediaPlayerBean, null, false);
    }

    @Override
    public void setPlayingMedia(PineMediaPlayerBean pineMediaPlayerBean, Map<String, String> headers) {
        mMediaPlayerComponent.setPlayingMedia(pineMediaPlayerBean, headers, false);
    }

    @Override
    public void setPlayingMedia(PineMediaPlayerBean pineMediaPlayerBean, boolean isAutocephalyPlayMode) {
        mMediaPlayerComponent.setPlayingMedia(pineMediaPlayerBean, null, false, isAutocephalyPlayMode);
    }

    @Override
    public void setPlayingMedia(PineMediaPlayerBean pineMediaPlayerBean, Map<String, String> headers, boolean isAutocephalyPlayMode) {
        mMediaPlayerComponent.setPlayingMedia(pineMediaPlayerBean, headers, false, isAutocephalyPlayMode);
    }

    @Override
    public void resetPlayingMediaAndResume(PineMediaPlayerBean pineMediaPlayerBean, Map<String, String> headers) {
        mMediaPlayerComponent.resetPlayingMediaAndResume(pineMediaPlayerBean, headers);
    }

    @Override
    public void savePlayerState() {
        mMediaPlayerComponent.savePlayerState();
    }

    @Override
    public int getDuration() {
        return mMediaPlayerComponent.getDuration();
    }

    @Override
    public int getCurrentPosition() {
        return mMediaPlayerComponent.getCurrentPosition();
    }

    @Override
    public PineMediaPlayerBean getMediaPlayerBean() {
        return mMediaPlayerComponent.getMediaPlayerBean();
    }

    @Override
    public MediaPlayer.TrackInfo[] getTrackInfo() {
        return mMediaPlayerComponent.getTrackInfo();
    }

    @Override
    public void seekTo(int pos) {
        mMediaPlayerComponent.seekTo(pos);
    }

    @Override
    public boolean isPlaying() {
        return mMediaPlayerComponent.isPlaying();
    }

    @Override
    public boolean isPause() {
        return mMediaPlayerComponent.isPause();
    }

    @Override
    public boolean isSurfaceViewEnable() {
        return mMediaPlayerComponent.isSurfaceViewEnable();
    }

    @Override
    public int getBufferPercentage() {
        return mMediaPlayerComponent.getBufferPercentage();
    }

    @Override
    public boolean canPause() {
        return mMediaPlayerComponent.canPause();
    }

    @Override
    public boolean canSeekBackward() {
        return mMediaPlayerComponent.canSeekBackward();
    }

    @Override
    public boolean canSeekForward() {
        return mMediaPlayerComponent.canSeekForward();
    }

    @Override
    public int getAudioSessionId() {
        return mMediaPlayerComponent.getAudioSessionId();
    }

    @Override
    public boolean isInPlaybackState() {
        return mMediaPlayerComponent.isInPlaybackState();
    }

    @Override
    public boolean isAttachViewMode() {
        return mMediaPlayerComponent.isAttachViewMode();
    }

    @Override
    public boolean isAttachViewShown() {
        return mMediaPlayerComponent.isAttachViewShown();
    }

    @Override
    public boolean isAutocephalyPlayMode() {
        return mMediaPlayerComponent.isAutocephalyPlayMode();
    }

    @Override
    public int getMediaPlayerState() {
        return mMediaPlayerComponent.getMediaPlayerState();
    }

    @Override
    public void removeMediaPlayerListener(PineMediaWidget.IPineMediaPlayerListener listener) {
        mMediaPlayerComponent.removeMediaPlayerListener(listener);
    }

    @Override
    public void addMediaPlayerListener(PineMediaWidget.IPineMediaPlayerListener listener) {
        mMediaPlayerComponent.addMediaPlayerListener(listener);
    }

    @Override
    public PineMediaPlayerView getMediaPlayerView() {
        return mMediaPlayerComponent.getMediaPlayerView();
    }

    @Override
    public PineSurfaceView getSurfaceView() {
        return mMediaPlayerComponent.getSurfaceView();
    }

    @Override
    public PineMediaPlayerView.PineMediaViewLayout getMediaAdaptionLayout() {
        return mMediaPlayerComponent.getMediaAdaptionLayout();
    }

    @Override
    public int getMediaViewWidth() {
        return mMediaPlayerComponent.getMediaViewWidth();
    }

    @Override
    public int getMediaViewHeight() {
        return mMediaPlayerComponent.getMediaViewHeight();
    }
}
