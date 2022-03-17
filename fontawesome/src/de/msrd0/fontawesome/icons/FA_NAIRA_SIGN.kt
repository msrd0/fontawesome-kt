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

object FA_NAIRA_SIGN: Icon {
	
	override val name get() = "Naira Sign"
	
	override val unicode get() = "e1f6"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M262.5 256H320V64C320 46.33 334.3 32 352 32C369.7 32 384 46.33 384 64V256H416C433.7 256 448 270.3 448 288C448 305.7 433.7 320 416 320H384V448C384 462.1 374.8 474.5 361.3 478.6C347.8 482.7 333.2 477.5 325.4 465.8L228.2 320H128V448C128 465.7 113.7 480 96 480C78.33 480 64 465.7 64 448V320H32C14.33 320 0 305.7 0 288C0 270.3 14.33 256 32 256H64V64C64 49.9 73.23 37.46 86.73 33.37C100.2 29.29 114.8 34.52 122.6 46.25L262.5 256zM305.1 320L320 342.3V320H305.1zM185.5 256L128 169.7V256H185.5z"/></svg>"""
		else -> null
	}
	
}
