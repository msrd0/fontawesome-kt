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

object FA_HIGH_TEMPERATURE: Icon {
	
	override val name get() = "High Temperature"
	
	override val unicode get() = "f769"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M160 322.9V112C160 103.3 152.8 96 144 96S128 103.3 128 112v210.9C109.4 329.5 96 347.1 96 368C96 394.5 117.5 416 144 416S192 394.5 192 368C192 347.1 178.6 329.5 160 322.9zM416 0c-52.88 0-96 43.13-96 96s43.13 96 96 96s96-43.13 96-96S468.9 0 416 0zM416 128c-17.75 0-32-14.25-32-32s14.25-32 32-32s32 14.25 32 32S433.8 128 416 128zM256 112c0-61.88-50.13-112-112-112s-112 50.13-112 112v166.5c-19.75 24.75-32 55.5-32 89.5c0 79.5 64.5 144 144 144s144-64.5 144-144c0-33.1-12.25-64.88-32-89.5V112zM144 448c-44.13 0-80-35.88-80-80c0-25.5 12.25-48.88 32-63.75v-192.3c0-26.5 21.5-48 48-48S192 85.5 192 112V304.3c19.75 14.75 32 38.25 32 63.75C224 412.1 188.1 448 144 448z"/></svg>"""
		else -> null
	}
	
}
