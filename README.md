# Hello JMS
A simple Spring-Boot application that produces and consumes messages on an ActiveMQ JMS queue.

## Installing ActiveMQ on Docker

1. Create a __volume__ directory with a __data__ subdirectory where the __install-activemq-on-docker.bat__ script is located.
2. Run the __install-activemq-on-docker.bat__ script.
3. You can access the ActiveMQ web console at the http://localhost:8161 address using the __admin/amqadm__ account.

## Port mapping

|Port|Mapping|
|-|-|
|1883|MQTT⁠|
|5672|AMPQ⁠|
|8161|WebConsole⁠|
|61613|STOMP⁠|
|61614|WS⁠|
|61616|OpenWire⁠|
