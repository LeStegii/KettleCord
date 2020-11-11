package net.md_5.bungee.entitymap;

import io.netty.buffer.ByteBuf;

// Waterfall

public class EntityMap_Dummy
  extends EntityMap
{
  public static final EntityMap_Dummy INSTANCE = new EntityMap_Dummy();
  
  public void rewriteServerbound(ByteBuf packet, int oldId, int newId) {}
  
  public void rewriteServerbound(ByteBuf packet, int oldId, int newId, int protocolVersion) {}
  
  public void rewriteClientbound(ByteBuf packet, int oldId, int newId) {}
  
  public void rewriteClientbound(ByteBuf packet, int oldId, int newId, int protocolVersion) {}
}
