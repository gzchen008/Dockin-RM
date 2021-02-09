/*
 * Copyright (C) @2021 Webank Group Holding Limited
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.webank.dockin.rm.service;
import cn.webank.dockin.rm.bean.biz.ResultDto;
import cn.webank.dockin.rm.bean.pod.PodInfoDTO;
import cn.webank.dockin.rm.database.dto.PodInfo;
import java.util.Set;
public interface PersistenceService {
    ResultDto getPodInfoByPodName(String podName);
    ResultDto getPodInfoByPodIp(String podIp);
    PodInfoDTO podDTO2DOConvertor(PodInfo podInfo) throws Exception;
    PodInfo getPodInfo(String podIp) throws Exception;
    int updateHostInfo(String hostIp) throws Exception;
    ResultDto removeInfoFromDB(Set<String> ipList, String offlineItsmId) throws Exception;
}
