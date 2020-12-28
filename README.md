
BungeeCord for 1.7-1.16 with Forge and Fabric Support
==========

**Fork:** [BungeeCord](https://github.com/SpigotMC/BungeeCord) >> [HexaCord](https://github.com/HexagonMC/BungeeCord) >> [KettleCord](https://github.com/UeberallGebannt/KettleCord/)

**What's HexaCord?**</br>
HexaCord reimplements Minecraft 1.7.10 and basic 1.7.10 Forge support.</br>
It also works better when using [Magma](https://magmafoundation.org/), [Thermos](https://github.com/CyberdyneCC/Thermos) and other hybrid servers.</br>
If you want more informations about it, please visit it's github page [here](https://github.com/HexagonMC/BungeeCord).

**What's KettleCord?**</br>
KettleCord is a fork of HexaCord with some little changes for our Minecraft network KettleMC.net.</br>
It also implements basic support for Fabric since normal BungeeCord blocks a packet that Fabric is waiting for.</br>
We implemented some patches from [Waterfall](https://github.com/PaperMC/Waterfall/) in order to patch some forge issues.

### Fabric support
KettleCord implements basic Fabric support by BukkitBuilder so that you can use Fabric servers in your network.</br>
You have to enable `fabric-support` in the config and install the [FabricProxy](https://www.curseforge.com/minecraft/mc-mods/fabricproxy) mod on your Fabric server.

### Security warning

As your Minecraft servers have to run without authentication (online-mode=false) for BungeeCord to work, this poses a new security risk. Users may connect to your servers directly, under any username they wish to use. The kick "If you wish to use IP forwarding, please enable it in your BungeeCord config as well!" does not protect your Spigot servers.

To combat this, you need to restrict access to these servers for example with a firewall (please see [firewall guide](https://www.spigotmc.org/wiki/firewall-guide/)) or a plugin like [PreventPortBypass](https://www.spigotmc.org/resources/preventportbypass-the-onlyproxyjoin-alternative.54934/).

### License

You can check the (BungeeCord/Hexacord) license [here](LICENSE).</br>
Any code that has been added by KettleCord is licensed under the license of the respective owner of the code.</br>
If any changes are made directly by KettleCord it's published under MIT License.

HexaCord is maintained by https://hexagonmc.eu.

This fork is maintained by https://KettleMC.net

### Releases can be downloaded here: [Releases](https://github.com/UeberallGebannt/KettleCord/releases)
