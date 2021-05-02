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

object FA_POWERPOINT_FILE: Icon {
	
	override val name get() = "Powerpoint File"
	
	override val unicode get() = "f1c4"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M193.7 271.2c8.8 0 15.5 2.7 20.3 8.1 9.6 10.9 9.8 32.7-.2 44.1-4.9 5.6-11.9 8.5-21.1 8.5h-26.9v-60.7h27.9zM377 105L279 7c-4.5-4.5-10.6-7-17-7h-6v128h128v-6.1c0-6.3-2.5-12.4-7-16.9zm-153 31V0H24C10.7 0 0 10.7 0 24v464c0 13.3 10.7 24 24 24h336c13.3 0 24-10.7 24-24V160H248c-13.2 0-24-10.8-24-24zm53 165.2c0 90.3-88.8 77.6-111.1 77.6V436c0 6.6-5.4 12-12 12h-30.8c-6.6 0-12-5.4-12-12V236.2c0-6.6 5.4-12 12-12h81c44.5 0 72.9 32.8 72.9 77z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M369.9 97.9L286 14C277 5 264.8-.1 252.1-.1H48C21.5 0 0 21.5 0 48v416c0 26.5 21.5 48 48 48h288c26.5 0 48-21.5 48-48V131.9c0-12.7-5.1-25-14.1-34zM332.1 128H256V51.9l76.1 76.1zM48 464V48h160v104c0 13.3 10.7 24 24 24h104v288H48zm72-60V236c0-6.6 5.4-12 12-12h69.2c36.7 0 62.8 27 62.8 66.3 0 74.3-68.7 66.5-95.5 66.5V404c0 6.6-5.4 12-12 12H132c-6.6 0-12-5.4-12-12zm48.5-87.4h23c7.9 0 13.9-2.4 18.1-7.2 8.5-9.8 8.4-28.5.1-37.8-4.1-4.6-9.9-7-17.4-7h-23.9v52z"/></svg>"""
		else -> null
	}
	
}
