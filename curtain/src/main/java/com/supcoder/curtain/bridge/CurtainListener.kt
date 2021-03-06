package com.supcoder.curtain.bridge

/**
 * 窗帘进度变化监听
 * @author lihc15
 * @date 2020/8/14
 */
interface OnProgressChangeListener {

    fun onProgressChanged(progress: Int)

}

/**
 * 窗帘动画结束监听
 */
interface OnAnimEndListener {

    fun onAnimEnd()
}