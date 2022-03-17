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

object FA_SHIELD_VIRUS: Icon {
	
	override val name get() = "Shield Virus"
	
	override val unicode get() = "e06c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M288 255.1c-8.836 0-16 7.162-16 16c0 8.836 7.164 15.1 16 15.1s16-7.163 16-15.1C304 263.2 296.8 255.1 288 255.1zM224 191.1c-8.836 0-16 7.162-16 16c0 8.836 7.164 16 15.1 16s16-7.164 16-16C240 199.2 232.8 191.1 224 191.1zM466.5 83.68l-192-80.01C269.6 1.641 261.3 0 256.1 0C250.7 0 242.5 1.641 237.6 3.672l-192 80.01C27.69 91.07 16 108.6 16 127.1C16 385.2 205.2 512 255.9 512c52.02 0 240.1-128.2 240.1-384C496 108.6 484.3 91.07 466.5 83.68zM384 255.1h-12.12c-19.29 0-32.06 15.78-32.06 32.23c0 7.862 2.918 15.88 9.436 22.4l8.576 8.576c3.125 3.125 4.688 7.218 4.688 11.31c0 8.527-6.865 15.1-16 15.1c-4.094 0-8.188-1.562-11.31-4.688l-8.576-8.576c-6.519-6.519-14.53-9.436-22.4-9.436c-16.45 0-32.23 12.77-32.23 32.06v12.12c0 8.844-7.156 16-16 16s-16-7.156-16-16v-12.12c0-19.29-15.78-32.06-32.23-32.06c-7.862 0-15.87 2.917-22.39 9.436l-8.576 8.576c-3.125 3.125-7.219 4.688-11.31 4.688c-9.139 0-16-7.473-16-15.1c0-4.094 1.562-8.187 4.688-11.31l8.576-8.576c6.519-6.519 9.436-14.53 9.436-22.4c0-16.45-12.77-32.23-32.06-32.23H128c-8.844 0-16-7.156-16-16s7.156-16 16-16h12.12c19.29 0 32.06-15.78 32.06-32.23c0-7.862-2.918-15.88-9.436-22.4L154.2 160.8C151 157.7 149.5 153.6 149.5 149.5c0-8.527 6.865-15.1 16-15.1c4.094 0 8.188 1.562 11.31 4.688L185.4 146.7C191.9 153.3 199.9 156.2 207.8 156.2c16.45 0 32.23-12.77 32.23-32.07V111.1c0-8.844 7.156-16 16-16s16 7.156 16 16v12.12c0 19.29 15.78 32.07 32.23 32.07c7.862 0 15.88-2.917 22.4-9.436l8.576-8.577c3.125-3.125 7.219-4.688 11.31-4.688c9.139 0 16 7.473 16 15.1c0 4.094-1.562 8.187-4.688 11.31l-8.576 8.577c-6.519 6.519-9.436 14.53-9.436 22.4c0 16.45 12.77 32.23 32.06 32.23h12.12c8.844 0 16 7.156 16 16S392.8 255.1 384 255.1z"/></svg>"""
		else -> null
	}
	
}
