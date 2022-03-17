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

object FA_KIT_MEDICAL: Icon {
	
	override val name get() = "Kit medical"
	
	override val unicode get() = "f479"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M64 32h32v448H64c-35.35 0-64-28.66-64-64V96C0 60.66 28.65 32 64 32zM128 32h320v448H128V32zM176 282c0 8.835 7.164 16 16 16h53.1V352c0 8.836 7.165 16 16 16h52c8.836 0 16-7.164 16-16V298H384c8.836 0 16-7.165 16-16v-52c0-8.837-7.164-16-16-16h-54V160c0-8.836-7.164-16-16-16h-52c-8.835 0-16 7.164-16 16v54H192c-8.836 0-16 7.163-16 16V282zM512 32h-32v448h32c35.35 0 64-28.66 64-64V96C576 60.66 547.3 32 512 32z"/></svg>"""
		else -> null
	}
	
}

val FA_FIRST_AID = FA_KIT_MEDICAL
