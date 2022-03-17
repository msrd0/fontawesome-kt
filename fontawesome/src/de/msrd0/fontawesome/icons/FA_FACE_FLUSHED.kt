/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID
import de.msrd0.fontawesome.Style.REGULAR

/** Face flushed */
object FA_FACE_FLUSHED: Icon {
	
	override val name get() = "Face flushed"
	
	override val unicode get() = "f579"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M184 224C184 237.3 173.3 248 160 248C146.7 248 136 237.3 136 224C136 210.7 146.7 200 160 200C173.3 200 184 210.7 184 224zM376 224C376 237.3 365.3 248 352 248C338.7 248 328 237.3 328 224C328 210.7 338.7 200 352 200C365.3 200 376 210.7 376 224zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM192 400H320C328.8 400 336 392.8 336 384C336 375.2 328.8 368 320 368H192C183.2 368 176 375.2 176 384C176 392.8 183.2 400 192 400zM160 296C199.8 296 232 263.8 232 224C232 184.2 199.8 152 160 152C120.2 152 88 184.2 88 224C88 263.8 120.2 296 160 296zM352 152C312.2 152 280 184.2 280 224C280 263.8 312.2 296 352 296C391.8 296 424 263.8 424 224C424 184.2 391.8 152 352 152z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M320 336C333.3 336 344 346.7 344 360C344 373.3 333.3 384 320 384H192C178.7 384 168 373.3 168 360C168 346.7 178.7 336 192 336H320zM136.4 224C136.4 210.7 147.1 200 160.4 200C173.6 200 184.4 210.7 184.4 224C184.4 237.3 173.6 248 160.4 248C147.1 248 136.4 237.3 136.4 224zM80 224C80 179.8 115.8 144 160 144C204.2 144 240 179.8 240 224C240 268.2 204.2 304 160 304C115.8 304 80 268.2 80 224zM160 272C186.5 272 208 250.5 208 224C208 197.5 186.5 176 160 176C133.5 176 112 197.5 112 224C112 250.5 133.5 272 160 272zM376.4 224C376.4 237.3 365.6 248 352.4 248C339.1 248 328.4 237.3 328.4 224C328.4 210.7 339.1 200 352.4 200C365.6 200 376.4 210.7 376.4 224zM432 224C432 268.2 396.2 304 352 304C307.8 304 272 268.2 272 224C272 179.8 307.8 144 352 144C396.2 144 432 179.8 432 224zM352 176C325.5 176 304 197.5 304 224C304 250.5 325.5 272 352 272C378.5 272 400 250.5 400 224C400 197.5 378.5 176 352 176zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_FLUSHED]. */
val FA_FLUSHED = FA_FACE_FLUSHED
