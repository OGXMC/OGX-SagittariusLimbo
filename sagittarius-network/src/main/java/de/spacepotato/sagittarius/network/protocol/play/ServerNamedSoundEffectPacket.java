package de.spacepotato.sagittarius.network.protocol.play;

import de.spacepotato.sagittarius.network.protocol.Packet;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ServerNamedSoundEffectPacket extends Packet {

	private String name;
	private double x;
	private double y;
	private double z;
	private float volume;
	private byte pitch;

	@Override
	public void write(ByteBuf buf) throws Exception {
		writeString(buf, name);
		buf.writeInt((int) (x * 8));
		buf.writeInt((int) (y * 8));
		buf.writeInt((int) (z * 8));
		buf.writeFloat(volume);
		buf.writeByte(pitch);
	}

	@Override
	public Packet createNewPacket() {
		return new ServerNamedSoundEffectPacket();
	}

	@Override
	public int getId() {
		return 0x29;
	}

}
