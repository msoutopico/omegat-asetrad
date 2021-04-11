/* :name = Pseudo-translate project :description=
 * 
 * @author      Manuel Souto Pico
 * @date        2020-09-12
 * @version     0.2.0
 */

/* 
 * @versions: 
 * 0.2.0: added %CODE% exclusion
 */
 
def gui(){
	def segm_count = 0;

	project.allEntries.each { currSegm ->
		editor.gotoEntry(currSegm.entryNum())
		def target = currSegm.getSrcText();

		// pseudo-translate upper case letters 
		search = /\p{Lu}(?![^<]*?>|[^%\s]*?%)/   
		replac = "X"
		target = target.replaceAll(search, replac)

		// pseudo-translate lower case letters 
		search = /\p{Ll}(?![^<]*?>|[^%\s]*?%)/   
		replac = "x"
		target = target.replaceAll(search, replac)

		// pseudo-translate ditis (in any case ;)
		search = /\p{N}(?![^<]*?>|[^%\s]*?%)/   
		replac = "#"
		target = target.replaceAll(search, replac)
				
		segm_count++;
		console.println(currSegm.entryNum() + ": '" + currSegm.getSrcText() + "' pseudo-translated as '" + target + "'")
		editor.replaceEditText(target)
	}
	console.println(segm_count + " segments modified")
}

