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
import de.msrd0.fontawesome.Style.BRANDS

object FA_DEPLOY_DOG: Icon {
	
	override val name get() = "deploy.dog"
	
	override val unicode get() = "f38e"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M382.2 136h51.7v239.6h-51.7v-20.7c-19.8 24.8-52.8 24.1-73.8 14.7-26.2-11.7-44.3-38.1-44.3-71.8 0-29.8 14.8-57.9 43.3-70.8 20.2-9.1 52.7-10.6 74.8 12.9V136zm-64.7 161.8c0 18.2 13.6 33.5 33.2 33.5 19.8 0 33.2-16.4 33.2-32.9 0-17.1-13.7-33.2-33.2-33.2-19.6 0-33.2 16.4-33.2 32.6zM188.5 136h51.7v239.6h-51.7v-20.7c-19.8 24.8-52.8 24.1-73.8 14.7-26.2-11.7-44.3-38.1-44.3-71.8 0-29.8 14.8-57.9 43.3-70.8 20.2-9.1 52.7-10.6 74.8 12.9V136zm-64.7 161.8c0 18.2 13.6 33.5 33.2 33.5 19.8 0 33.2-16.4 33.2-32.9 0-17.1-13.7-33.2-33.2-33.2-19.7 0-33.2 16.4-33.2 32.6zM448 96c17.5 0 32 14.4 32 32v256c0 17.5-14.4 32-32 32H64c-17.5 0-32-14.4-32-32V128c0-17.5 14.4-32 32-32h384m0-32H64C28.8 64 0 92.8 0 128v256c0 35.2 28.8 64 64 64h384c35.2 0 64-28.8 64-64V128c0-35.2-28.8-64-64-64z"/></svg>"""
		else -> null
	}
	
}
