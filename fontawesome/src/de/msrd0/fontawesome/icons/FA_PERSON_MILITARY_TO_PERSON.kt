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

/** Person Military-to-person */
object FA_PERSON_MILITARY_TO_PERSON: Icon {
	
	override val name get() = "Person Military-to-person"
	
	override val unicode get() = "e54c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M182.2 .0998C191.7-.9534 200 6.466 200 16V30.13C200 38.91 192.9 46.05 184.1 46.13H72.74C63.48 46.04 56 38.52 56 29.24C56 20.64 62.47 13.41 71.02 12.46L182.2 .0998zM192 96C192 131.3 163.3 160 128 160C92.65 160 64 131.3 64 96C64 89.8 64.88 83.8 66.53 78.13H189.5C191.1 83.8 192 89.8 192 96V96zM32 256C32 237.2 40.09 220.3 52.97 208.6L197.2 319.6C195.5 319.9 193.8 320 192 320H64C46.33 320 32 305.7 32 288L32 256zM222.2 298.5L85.05 192.9C88.61 192.3 92.27 191.1 96 191.1H160C195.3 191.1 224 220.7 224 255.1V287.1C224 291.7 223.4 295.2 222.2 298.5V298.5zM320 96C320 60.65 348.7 31.1 384 31.1C419.3 31.1 448 60.65 448 96C448 131.3 419.3 160 384 160C348.7 160 320 131.3 320 96zM416 192C451.3 192 480 220.7 480 256V288C480 305.7 465.7 320 448 320H320C302.3 320 288 305.7 288 288V256C288 220.7 316.7 192 352 192H416zM151.8 506.1C141.8 514.8 126.7 513.8 117.9 503.8C109.2 493.8 110.2 478.7 120.2 469.9L136.1 456L23.1 455.1C10.74 455.1-.0003 445.2 0 431.1C.0003 418.7 10.75 407.1 24 407.1L136.1 408L120.2 394.1C110.2 385.3 109.2 370.2 117.9 360.2C126.7 350.2 141.8 349.2 151.8 357.9L215.8 413.9C221 418.5 224 425.1 224 431.1C224 438.9 221 445.5 215.8 450.1L151.8 506.1zM296.2 413.9L360.2 357.9C370.2 349.2 385.3 350.2 394.1 360.2C402.8 370.2 401.8 385.3 391.8 394.1L375.9 407.1L488 407.1C501.3 407.1 512 418.7 512 431.1C512 445.2 501.3 455.1 488 455.1L375.9 455.1L391.8 469.9C401.8 478.7 402.8 493.8 394.1 503.8C385.3 513.8 370.2 514.8 360.2 506.1L296.2 450.1C290.1 445.5 288 438.9 288 431.1C288 425.1 290.1 418.5 296.2 413.9H296.2z"/></svg>"""
		else -> null
	}
	
}
