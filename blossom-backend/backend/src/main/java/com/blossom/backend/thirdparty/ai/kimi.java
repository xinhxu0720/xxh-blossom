package com.blossom.backend.thirdparty.ai;

import com.blossom.backend.repository.mapper.StockNewsArticlesMapper;
import com.blossom.backend.repository.model.StockNewsArticles;
import com.blossom.common.base.util.json.JsonUtil;
import com.github.pagehelper.util.StringUtil;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

enum ChatMessageRole {
    SYSTEM, USER, ASSISTANT;

    public String value() {
        return this.name().toLowerCase();
    }
}

class ChatCompletionMessage {
    public String role;
    public String name;
    public String content;
    public Boolean partial;

    public ChatCompletionMessage(String role, String content) {
        this.role = role;
        this.content = content;
    }

    public ChatCompletionMessage(String role, String name, String content, Boolean partial) {
        this.role = role;
        this.name = name;
        this.content = content;
        this.partial = partial;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Boolean getPartial() {
        return partial;
    }
}

class ChatCompletionStreamChoiceDelta {
    private String content;
    private String role;

    public String getContent() {
        return content;
    }

    public String getRole() {
        return role;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ChatCompletionStreamChoiceDelta(String content, String role) {
        this.content = content;
        this.role = role;
    }
}

class Usage {
    private int promptTokens;
    private int completionTokens;
    private int totalTokens;

    public int getPromptTokens() {
        return promptTokens;
    }

    public int getCompletionTokens() {
        return completionTokens;
    }

    public int getTotalTokens() {
        return totalTokens;
    }
}

class ChatCompletionStreamChoice {
    private int index;
    private ChatCompletionStreamChoiceDelta delta;

    @SerializedName("finish_reason")
    private String finishReason;
    private Usage usage;

    public int getIndex() {
        return index;
    }

    public ChatCompletionStreamChoiceDelta getDelta() {
        return delta;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setDelta(ChatCompletionStreamChoiceDelta delta) {
        this.delta = delta;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public ChatCompletionStreamChoice(int index, ChatCompletionStreamChoiceDelta delta, String finishReason, Usage usage) {
        this.index = index;
        this.delta = delta;
        this.finishReason = finishReason;
        this.usage = usage;
    }
}

class ChatCompletionStreamResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<ChatCompletionStreamChoice> choices;

    public String getId() {
        return id;
    }

    public String getObject() {
        return object;
    }

    public long getCreated() {
        return created;
    }

    public String getModel() {
        return model;
    }

    public List<ChatCompletionStreamChoice> getChoices() {
        return choices;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setCreated(long created) {
        this.created = created;
    }
}

class ChatCompletionChoice {
    private int index;
    private ChatCompletionMessage message;

    @SerializedName("finish_reason")
    private String finishReason;

    public int getIndex() {
        return index;
    }

    public ChatCompletionMessage getMessage() {
        return message;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setMessage(ChatCompletionMessage message) {
        this.message = message;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

}

class ChatCompletionResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private List<ChatCompletionChoice> choices;
    private Usage usage;

    public String getId() {
        return id;
    }

    public String getObject() {
        return object;
    }

    public long getCreated() {
        return created;
    }

    public String getModel() {
        return model;
    }

    public List<ChatCompletionChoice> getChoices() {
        if (choices == null) {
            return List.of();
        }
        return choices;
    }
}


class ChatCompletionRequest {
    public String model;
    public List<ChatCompletionMessage> messages;

    @SerializedName("max_tokens")
    public int maxTokens;

    @SerializedName("temperature")
    public float temperature;
    public float topP;

    public Integer n;
    public boolean stream;
    public List<String> stop;

    @SerializedName("presence_penalty")
    public float presencePenalty;

    @SerializedName("frequency_penalty")
    public float frequencyPenalty;

    public String user;

    public List<ChatCompletionMessage> getMessages() {
        return messages;
    }

    public ChatCompletionRequest(String model, List<ChatCompletionMessage> messages, int maxTokens, float temperature, int n) {
        this.model = model;
        this.messages = messages;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.n = n;
    }

}

class Model {
    private String id;
    private String object;

    @SerializedName("owner_by")
    private String ownedBy;
    private String root;
    private String parent;

    public String getId() {
        return id;
    }

    public String getObject() {
        return object;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public String getRoot() {
        return root;
    }

    public String getParent() {
        return parent;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Model(String id, String object, String ownedBy, String root, String parent) {
        this.id = id;
        this.object = object;
        this.ownedBy = ownedBy;
        this.root = root;
        this.parent = parent;
    }
}

class ModelsList {
    private List<Model> data;

    public List<Model> getData() {
        return data;
    }

    public void setData(List<Model> data) {
        this.data = data;
    }

    public ModelsList(List<Model> data) {
        this.data = data;
    }
}

class Client {
    private static final String DEFAULT_BASE_URL = "https://api.moonshot.cn/v1";

    private static final String CHAT_COMPLETION_SUFFIX = "/chat/completions";
    private static final String MODELS_SUFFIX = "/models";
    private static final String FILES_SUFFIX = "/files";

    private String baseUrl;
    private String apiKey;

    public Client(String apiKey) {
        this(apiKey, DEFAULT_BASE_URL);
    }

    public Client(String apiKey, String baseUrl) {
        this.apiKey = apiKey;
        if (baseUrl.endsWith("/")) {
            baseUrl = baseUrl.substring(0, baseUrl.length() - 1);
        }
        this.baseUrl = baseUrl;
    }

    public String getChatCompletionUrl() {
        return baseUrl + CHAT_COMPLETION_SUFFIX;
    }

    public String getModelsUrl() {
        return baseUrl + MODELS_SUFFIX;
    }

    public String getFilesUrl() {
        return baseUrl + FILES_SUFFIX;
    }

    public String getApiKey() {
        return apiKey;
    }

    public ModelsList ListModels() throws IOException {
        okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(getModelsUrl())
                .addHeader("Authorization", "Bearer " + getApiKey())
                .build();
        try {
            okhttp3.Response response = client.newCall(request).execute();
            String body = response.body().string();
            Gson gson = new Gson();
            return gson.fromJson(body, ModelsList.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }


    public ChatCompletionResponse ChatCompletion(ChatCompletionRequest request) throws IOException {
        request.stream = false;
        okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
        okhttp3.MediaType mediaType = okhttp3.MediaType.parse("application/json");
        okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, new Gson().toJson(request));
        okhttp3.Request httpRequest = new okhttp3.Request.Builder()
                .url(getChatCompletionUrl())
                .addHeader("Authorization", "Bearer " + getApiKey())
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();
        try {
            okhttp3.Response response = client.newCall(httpRequest).execute();
            String responseBody = response.body().string();
            System.out.println(responseBody);
            Gson gson = new Gson();
            return gson.fromJson(responseBody, ChatCompletionResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    // return a stream of ChatCompletionStreamResponse
    public Flowable<ChatCompletionStreamResponse> ChatCompletionStream(ChatCompletionRequest request) throws IOException {
        request.stream = true;
        okhttp3.OkHttpClient client = new okhttp3.OkHttpClient();
        okhttp3.MediaType mediaType = okhttp3.MediaType.parse("application/json");
        okhttp3.RequestBody body = okhttp3.RequestBody.create(mediaType, new Gson().toJson(request));
        okhttp3.Request httpRequest = new okhttp3.Request.Builder()
                .url(getChatCompletionUrl())
                .addHeader("Authorization", "Bearer " + getApiKey())
                .addHeader("Content-Type", "application/json")
                .post(body)
                .build();
        okhttp3.Response response = client.newCall(httpRequest).execute();
        if (response.code() != 200) {
            throw new RuntimeException("Failed to start stream: " + response.body().string());
        }

        // get response body line by line
        return Flowable.create(emitter -> {
            okhttp3.ResponseBody responseBody = response.body();
            if (responseBody == null) {
                emitter.onError(new RuntimeException("Response body is null"));
                return;
            }
            String line;
            while ((line = responseBody.source().readUtf8Line()) != null) {
                if (line.startsWith("data:")) {
                    line = line.substring(5);
                    line = line.trim();
                }
                if (Objects.equals(line, "[DONE]")) {
                    emitter.onComplete();
                    return;
                }
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                Gson gson = new Gson();
                ChatCompletionStreamResponse streamResponse = gson.fromJson(line, ChatCompletionStreamResponse.class);
                emitter.onNext(streamResponse);
            }
            emitter.onComplete();
        }, BackpressureStrategy.BUFFER);
    }
}

@Slf4j
public class kimi {


    public static String getResult(String request, StockNewsArticlesMapper mapper, StockNewsArticles articles) throws InterruptedException {
        String apiKey = "sk-kFMhLBTw1xQge39Ba2JONhNDIKwCfbZbODJl3HoX8CTYDGfk";
        StringBuilder str = new StringBuilder();
        log.info("请求kimi开始 request={}", request);
        Thread.sleep(4000);

        Client client = new Client(apiKey);

        final List<ChatCompletionMessage> messages = List.of(
                new ChatCompletionMessage(ChatMessageRole.SYSTEM.value(),
                        "你是一位专业的A股股票交易员，我会把当天的新闻提供给你，你通过新闻以及当下的局势来分析一下，这个消息是利好，还是利空？利好的话哪些股票会涨呢？推荐几只会涨的龙头股给我,必须是明显利好的才给我推荐,并且在返回的结果里必须包含 -这是利好的消息- 这5个连续字体，如果不是很明显无须推荐，利空的话，哪些股票会跌呢？"),
                new ChatCompletionMessage(ChatMessageRole.USER.value(),
                        request)
        );


        try {
            client.ChatCompletionStream(new ChatCompletionRequest(
                    "moonshot-v1-128k",
                    messages,
                    1024,
                    0.3f,
                    1
            )).subscribe(
                    streamResponse -> {
                        if (streamResponse.getChoices().isEmpty()) {
                            return;
                        }
                        for (ChatCompletionStreamChoice choice : streamResponse.getChoices()) {
                            String finishReason = choice.getFinishReason();
                            if (finishReason != null) {
                                System.out.println("finish reason: " + finishReason);
                                continue;
                            }
                            str.append(choice.getDelta().getContent());
                        }
                    },
                    Throwable::printStackTrace,
                    () -> {
                        System.out.println("complete");
                        articles.setCreateTime(System.currentTimeMillis());
                        articles.setUpdateTime(System.currentTimeMillis());
                        articles.setQianfanAi(str.toString());
                        if (str.toString().contains("这是利好的消息")) {
                            articles.setResultType(Byte.valueOf("1"));
                        }
                        mapper.insertSelective(articles);
                        log.info("定时任务查询到结果 写入完成 result={}", JsonUtil.toJson(articles));
                    }
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("请求kimi结束==== resp={}", str);
        return str.toString();
    }
}
