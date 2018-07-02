package cn.yks.hrmapp.dao;

import cn.yks.hrmapp.model.Document;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by thanatos on 2018/6/9.
 * <p>
 * 文件dao接口
 */
@Repository("documentDao")
public interface IDocumentDao {

    /**
     * 批量查询文档信息
     *
     * @param document
     * @return
     */
    List<Document> selectDocumentByPage(Document document);

    /**
     * 统计符合条件的文档数量
     *
     * @param params
     * @return
     */
    Integer countDocument(Map<String, Object> params);

    /**
     * 根据id查询文档信息
     *
     * @param id
     * @return
     */
    Document selectDocumentById(Integer id);

    /**
     * 根据id删除文档信息
     *
     * @param id
     */
    void deleteDocumentById(Integer id);

    /**
     * 保存文档信息
     *
     * @param document
     */
    void saveDocument(Document document);

    /**
     * 更新文档信息
     *
     * @param document
     */
    void updateDocument(Document document);
}
