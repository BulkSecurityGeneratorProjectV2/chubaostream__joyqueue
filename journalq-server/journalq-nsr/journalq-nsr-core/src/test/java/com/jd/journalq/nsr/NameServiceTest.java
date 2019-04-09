package com.jd.journalq.nsr;

import com.jd.journalq.domain.*;
import com.jd.journalq.nsr.config.NameServiceConfig;
import com.jd.journalq.toolkit.network.IpUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * @author wylixiaobin
 * Date: 2018/8/20
 */

public class NameServiceTest{
    private NameService nameService;

    @Before
    public void init() throws Exception {
        NameServiceConfig nameServiceConfig = new NameServiceConfig(null);
        NameServer server = new NameServer();
        //server.start();
        nameService = new ThinNameService(nameServiceConfig);
        try {
            nameService.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void after(){
        //nameService.stop();
    }

    @Test
    public void subscribe() throws InterruptedException {
        String app = "jmq";
        String topic = "__group_coordinators";
        nameService.subscribe(new Subscription(TopicName.parse(topic),app, Subscription.Type.CONSUMPTION), ClientType.JMQ);
        nameService.subscribe(new Subscription(TopicName.parse(topic),app, Subscription.Type.CONSUMPTION), ClientType.JMQ);
        System.out.println("success");
    }


    @Test
    public void unSubscribe() {
        String app = "jmq";
        String topic = "__group_coordinators";
        nameService.unSubscribe(new Subscription(TopicName.parse(topic),app, Subscription.Type.CONSUMPTION));
        nameService.unSubscribe(new Subscription(TopicName.parse(topic),app, Subscription.Type.CONSUMPTION));
        System.out.println("success");

    }

    @Test
    public void hasSubscribe() {
        String app = "jmq2";
        String topic = "__group_coordinators";
        boolean have = nameService.hasSubscribe(app,Subscription.Type.CONSUMPTION);
         have = nameService.hasSubscribe(app,Subscription.Type.CONSUMPTION);
        System.out.println(have);
    }

    @Test
    public void leaderReport() {
        nameService.getBroker(1);
        String topic = "lxb_test";
        int partitionGroup = 0;
        int leaderBrokerId = 1550553501;
        Set<Integer> isrId =new HashSet<>();
        int termId = 0;

        nameService.leaderReport(TopicName.parse(topic),partitionGroup,leaderBrokerId,isrId,termId);
        nameService.leaderReport(TopicName.parse(topic),partitionGroup,leaderBrokerId,isrId,termId);
        System.out.println(termId);

    }

    @Test
    public void getBroker() throws InterruptedException {
        Broker broker = nameService.getBroker(1550058289);
        broker = nameService.getBroker(1550058289);
        System.out.println(broker);

    }

    @Test
    public void getAllBrokers() {
        List<Broker> brokers = nameService.getAllBrokers();
        brokers = nameService.getAllBrokers();
        System.out.println(Arrays.toString(brokers.toArray()));
    }

    @Test
    public void addProducer() {
    }

    @Test
    public void addConsumer() {
    }

    @Test
    public void addTopic() {
    }

    @Test
    public void getTopicConfig() {
        String topic = "__group_coordinators";
        TopicConfig topicConfig = nameService.getTopicConfig(TopicName.parse(topic));
        topicConfig = nameService.getTopicConfig(TopicName.parse("lxb_test1"));
        System.out.println(topicConfig);
    }

    @Test
    public void getAllTopics() {
        Set<String> topicConfigs = nameService.getAllTopics();
        topicConfigs = nameService.getAllTopics();
        System.out.println(Arrays.toString(topicConfigs.toArray()));
    }

    @Test
    public void getTopics() {
        String app = "jmq";
        String topic = "__group_coordinators";
        Set<String> topicConfigs = nameService.getTopics(app,Subscription.Type.PRODUCTION);
        topicConfigs = nameService.getTopics(app,Subscription.Type.PRODUCTION);
        System.out.println(Arrays.toString(topicConfigs.toArray()));
    }

    @Test
    public void getTopicConfigByBroker() {
        Map<TopicName,TopicConfig> topicConfigs = nameService.getTopicConfigByBroker(1550058289);
        topicConfigs = nameService.getTopicConfigByBroker(1550058289);
        System.out.println(topicConfigs);
    }

    @Test
    public void register() {
        Broker broker =  nameService.register(1111,IpUtil.getLocalIp(),50088);
        broker = nameService.register(null,IpUtil.getLocalIp(),50088);
        System.out.println(broker);
        // broker =  nameService.register(null,"192.168.1.1",50088);
        //broker =  nameService.register(null,"192.168.2.2",50088);
    }

    @Test
    public void getProducerByTopicAndApp() {
        String app = "jmq";
        String topic = "__group_coordinators";
        Producer producer = nameService.getProducerByTopicAndApp(TopicName.parse(topic),app);
        producer = nameService.getProducerByTopicAndApp(TopicName.parse(topic),app);
        System.out.println(producer);
    }

    @Test
    public void getConsumerByTopicAndApp() {
        String app = "poslp";
        String topic = "watch/login_state/2BD434B859B4FED39DCA90B2B09AAF57";
        Consumer consumer = nameService.getConsumerByTopicAndApp(TopicName.parse(topic),app);
        System.out.println(consumer);
    }

    @Test
    public void getTopicConfigByApp() {
        String app = "jmq";
        Map<TopicName,TopicConfig> topicConfigs = nameService.getTopicConfigByApp(app,Subscription.Type.CONSUMPTION);
        topicConfigs = nameService.getTopicConfigByApp(app,Subscription.Type.CONSUMPTION);
        System.out.println(topicConfigs);
    }

    @Test
    public void getDataCenter() {
        DataCenter dataCenter = nameService.getDataCenter(IpUtil.getLocalIp());
        dataCenter = nameService.getDataCenter(IpUtil.getLocalIp());
        System.out.println(dataCenter);
    }

    @Test
    public void getConfig() {
        System.out.println(nameService.getConfig("aa","bb"));
        System.out.println(nameService.getConfig("aa","bb"));
    }

    @Test
    public void getAllConfigs(){
        List list3 = nameService.getAllConfigs();
        List list2 = nameService.getAllBrokers();
        List list1 = nameService.getAllBrokers();

        System.out.println(Arrays.toString(list1.toArray()));
    }

    @Test
    public void getBrokerByRetryType() {
        List<Broker> list = nameService.getBrokerByRetryType(Broker.DEFAULT_RETRY_TYPE);
        list = nameService.getBrokerByRetryType(Broker.DEFAULT_RETRY_TYPE);
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void getConsumerByTopic() {
      String topic = "lxb_test";
      List<Consumer> list = nameService.getConsumerByTopic(TopicName.parse(topic));
      System.out.println(Arrays.toString(list.toArray()));

    }

    @Test
    public void getProducerByTopic() {
        String topic = "__group_coordinators";
        List<Producer> list = nameService.getProducerByTopic(TopicName.parse(topic));
        List<Producer> list2 = nameService.getProducerByTopic(TopicName.parse(topic));
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void getReplicaByBroker() {
        List<Replica> list = nameService.getReplicaByBroker(1550058289);
        List<Replica> list2= nameService.getReplicaByBroker(1550058289);
        System.out.println(Arrays.toString(list.toArray()));
    }

    @Test
    public void getAppToken() {
        AppToken appToken = nameService.getAppToken("poslp","2e2b2eb5-5c2e-49b0-8589-22aa71ca0c99");
        System.out.println(appToken);
    }
}
