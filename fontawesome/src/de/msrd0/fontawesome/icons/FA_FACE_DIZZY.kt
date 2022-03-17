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

/** Face dizzy */
object FA_FACE_DIZZY: Icon {
	
	override val name get() = "Face dizzy"
	
	override val unicode get() = "f567"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM256 416C291.3 416 320 387.3 320 352C320 316.7 291.3 288 256 288C220.7 288 192 316.7 192 352C192 387.3 220.7 416 256 416zM100.7 155.3L137.4 192L100.7 228.7C94.44 234.9 94.44 245.1 100.7 251.3C106.9 257.6 117.1 257.6 123.3 251.3L160 214.6L196.7 251.3C202.9 257.6 213.1 257.6 219.3 251.3C225.6 245.1 225.6 234.9 219.3 228.7L182.6 192L219.3 155.3C225.6 149.1 225.6 138.9 219.3 132.7C213.1 126.4 202.9 126.4 196.7 132.7L160 169.4L123.3 132.7C117.1 126.4 106.9 126.4 100.7 132.7C94.44 138.9 94.44 149.1 100.7 155.3zM292.7 155.3L329.4 192L292.7 228.7C286.4 234.9 286.4 245.1 292.7 251.3C298.9 257.6 309.1 257.6 315.3 251.3L352 214.6L388.7 251.3C394.9 257.6 405.1 257.6 411.3 251.3C417.6 245.1 417.6 234.9 411.3 228.7L374.6 192L411.3 155.3C417.6 149.1 417.6 138.9 411.3 132.7C405.1 126.4 394.9 126.4 388.7 132.7L352 169.4L315.3 132.7C309.1 126.4 298.9 126.4 292.7 132.7C286.4 138.9 286.4 149.1 292.7 155.3z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M192 352C192 316.7 220.7 288 256 288C291.3 288 320 316.7 320 352C320 387.3 291.3 416 256 416C220.7 416 192 387.3 192 352zM103 135C112.4 125.7 127.6 125.7 136.1 135L160 158.1L183 135C192.4 125.7 207.6 125.7 216.1 135C226.3 144.4 226.3 159.6 216.1 168.1L193.9 192L216.1 215C226.3 224.4 226.3 239.6 216.1 248.1C207.6 258.3 192.4 258.3 183 248.1L160 225.9L136.1 248.1C127.6 258.3 112.4 258.3 103 248.1C93.66 239.6 93.66 224.4 103 215L126.1 192L103 168.1C93.66 159.6 93.66 144.4 103 135V135zM295 135C304.4 125.7 319.6 125.7 328.1 135L352 158.1L375 135C384.4 125.7 399.6 125.7 408.1 135C418.3 144.4 418.3 159.6 408.1 168.1L385.9 192L408.1 215C418.3 224.4 418.3 239.6 408.1 248.1C399.6 258.3 384.4 258.3 375 248.1L352 225.9L328.1 248.1C319.6 258.3 304.4 258.3 295 248.1C285.7 239.6 285.7 224.4 295 215L318.1 192L295 168.1C285.7 159.6 285.7 144.4 295 135V135zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_DIZZY]. */
val FA_DIZZY = FA_FACE_DIZZY
