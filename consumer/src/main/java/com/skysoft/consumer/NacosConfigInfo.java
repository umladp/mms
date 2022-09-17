package com.skysoft.consumer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(prefix = "spring.cloud.nacos.config")
@EnableAutoConfiguration
@Configuration
@Component
public class NacosConfigInfo {

	/**
	 * Nacos server address.
	 */
	private String serverAddr;

	/**
	 * Data Id prefix.
	 */
	private String prefix;

	/**
	 * Nacos group.
	 */
	private String group;

	/**
	 * Nacos namespace.
	 */
	private String namespace;

	public String getServerAddr() {
		return serverAddr;
	}

	public void setServerAddr(String serverAddr) {
		this.serverAddr = serverAddr;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

}

