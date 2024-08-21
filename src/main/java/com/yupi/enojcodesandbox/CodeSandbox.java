package com.yupi.enojcodesandbox;


import com.yupi.enojcodesandbox.model.ExecuteCodeRequest;
import com.yupi.enojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
