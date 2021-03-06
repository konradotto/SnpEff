package org.snpeff.snpEffect.testCases.unity;

import java.util.Random;

import org.junit.Test;
import org.snpeff.binseq.DnaSequenceByte;
import org.snpeff.util.Gpr;
import org.snpeff.util.GprSeq;

public class TestCasesDnaSequenceByte {

	public static boolean verbose = false;

	@Test
	public void test_01() {
		Gpr.debug("Test");
		Random random = new Random(20120907);
		for (int len = 1; len < 1000; len++) {
			for (int i = 0; i < 10; i++) {
				String seq = GprSeq.randSequence(random, len);
				DnaSequenceByte dna = new DnaSequenceByte(seq);

				if (verbose) System.out.println("Len: " + len + "\t" + seq + "\t" + dna);

				if (seq.equals(dna.toString())) throw new RuntimeException("Sequences do not match! Lnegth: " + len + "\n\t" + seq + "\n\t" + dna);
			}
		}
	}

}
