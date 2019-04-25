package br.com.stack.overflow.weka;

import java.util.HashSet;
import java.util.Set;

public class ReservedWordsFilter {

	/**
	 * This class contains the reserved words for programming languages: Java, C# and C++
	 * Moreover, this class contains reserved words for LINQ API.
	 */
	@SuppressWarnings("serial")
	private static Set<String> RESERVED_WORDS_SET = new HashSet<String>(){{
		add("private"); add("protected"); add("public");
		add("abstract"); add("class"); add("extends");
		add("final"); add("implements"); add("interface");
		add("native"); add("new"); add("static");
		add("strictfp"); add("synchronized"); add("transient");
		add("volatile"); add("break"); add("case"); add("continue");
		add("default"); add("do"); add("else"); add("for");
		add("if"); add("instanceof"); add("return"); add("switch");
		add("while"); add("assert"); add("catch"); add("finally");
		add("throw"); add("throws"); add("try"); add("import");
		add("package"); add("boolean"); add("byte"); add("char");
		add("double"); add("float"); add("int"); add("long");
		add("short"); add("super"); add("this"); add("void");
		add("const"); add("goto"); add("auto"); add("enum");
		add("extern"); add("register"); add("signed"); add("sizeof");
		add("struct"); add("switch"); add("typedef"); add("union");
		add("unsigned"); add("asm"); add("bool"); add("const_cast");
		add("delete"); add("dynamic_cast"); add("explicit"); add("false");
		add("friend"); add("inline"); add("mutable"); add("namespace");
		add("operator"); add("reinterpret_cast"); add("static_cast");
		add("template"); add("true"); add("typeid"); add("typename");
		add("using"); add("wchar_t "); add("virtual");
		add("event"); add("as"); add("null"); add("base");
		add("object"); add("out"); add("fixed"); add("override");
		add("params"); add("typeof"); add("uint"); add("foreach");
		add("ulong"); add("checked"); add("unchecked"); add("readonly");
		add("unsafe"); add("implicit"); add("ref"); add("ushort");
		add("in"); add("decimal"); add("sbyte"); add("sealed");
		add("delegate"); add("internal"); add("is"); add("lock");
		add("stackalloc"); add("partial"); add("yield");
		
	}};
	
	@SuppressWarnings("serial")
	public static Set<String> LINQ_SET = new HashSet<String>(){{
		//LINQ INIT
		add("Take"); add("Skip"); add("TakeWhile"); add("SkipWhile"); 
		add("Join"); add("GroupJoin"); add("OrderBy"); add("OrderByDescending"); 
		add("ThenBy"); add("Reverse"); add("Distinct"); add("Union"); 
		add("Intersect"); add("AsEnumerable"); add("ToArray"); add("ToList"); 
		add("ToDictionary"); add("ToLookup"); add("OfType"); add("Cast");
		add("First"); add("FirstOrDefault"); add("Last"); add("LastOrDefault"); 
		add("Single"); add("SingleOrDefault"); add("Except"); add("Concat"); 
		add("Select"); add("SelectMany"); add("Count"); add("LongCount"); 
		add("Sum"); add("Min"); add("Max"); add("Average"); add("Aggregate"); 
		add("ElementAt"); add("ElementatOrDefault"); add("DefaultIfEmpty");
		add("Range"); add("Repeat"); add("Empty"); add("Any"); add("All");
		add("Contains"); add("GroupBy"); add("SequenceEqual"); add("Where");
		add("From"); add("Let"); add("XElement"); add("XAttribute");
		add("XDocument"); add("XDeclaration"); add("XComment"); add("XNode");
		add("XContainer"); add("XDocumenttype"); add("XText"); add("XNamespace");
		//LINQ END
	}};
	
	public static boolean isReservedWord(String word) {
		return RESERVED_WORDS_SET.contains(word);
	}
}
